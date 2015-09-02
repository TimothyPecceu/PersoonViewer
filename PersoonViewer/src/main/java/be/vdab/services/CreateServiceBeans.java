package be.vdab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import be.vdab.daos.PersoonDAO;

@Configuration
public class CreateServiceBeans {

	@Autowired
	@Qualifier("CSV")
	private PersoonDAO persoonDAO;
	
	@Bean
	public PersoonService persoonService(){
		return new PersoonServiceImpl(persoonDAO);
	}
}
