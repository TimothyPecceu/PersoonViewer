package be.vdab.presentation;

import java.io.IOException;

import be.vdab.entities.Persoon;
import be.vdab.enums.PersoonEigenschap;
import be.vdab.services.PersoonService;

public class PersoonViewer {

	private PersoonEigenschap[] eigenschappen;
	private PersoonService persoonService;
	
	public PersoonViewer(PersoonEigenschap[] eigenschappen, PersoonService persoonService) {
		this.eigenschappen = eigenschappen;
		this.persoonService = persoonService;
	}
	
	public void afbeelden() throws IOException{
		for(Persoon persoon : persoonService.findAll()){
			for(PersoonEigenschap eigenschap : eigenschappen){
				toonEigenschap(persoon, eigenschap);
			}
			System.out.println("------------------------------");
		}
	}
	
	private void toonEigenschap(Persoon persoon, PersoonEigenschap eigenschap){
		switch (eigenschap) {
		case PERSOON_NR:
			System.out.println("nr: " + persoon.getPersoonNr());
			break;
		case VOORNAAM:
			System.out.println("voornaam: " + persoon.getVoornaam());
			break;
		case FAMILIENAAM:
			System.out.println("familienaam: " + persoon.getFamilienaam());
			break;
		case AANTAL_KINDEREN:
			System.out.println("aantalKinderen: " + persoon.getAantalKinderen());
			break;
		}
	}
}
