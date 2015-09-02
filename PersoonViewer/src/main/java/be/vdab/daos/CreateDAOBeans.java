package be.vdab.daos;

import java.io.File;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:dao.properties")
public class CreateDAOBeans {
	
	@Value("${persoonCSV}")
	File csvBestand;
	
	@Value("${persoonTXT}")
	File txtBestand;
	
	@Bean
	@Qualifier("CSV")
	PersoonDAO persoonDAOCSV(){
		return new PersoonDAOCSV(csvBestand);
	}
	
	@Bean
	@Qualifier("TXT")
	PersoonDAO persoonDAOTXT(){
		return new PersoonDAOMeerdereRegels(txtBestand);
	}
}
