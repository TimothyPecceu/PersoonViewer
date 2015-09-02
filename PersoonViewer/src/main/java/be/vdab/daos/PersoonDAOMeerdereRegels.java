package be.vdab.daos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import be.vdab.entities.Persoon;

class PersoonDAOMeerdereRegels implements PersoonDAO {

	private final File bestand;

	PersoonDAOMeerdereRegels(File bestand) {
		this.bestand = bestand;
	}

	@Override
	public List<Persoon> findAll() {
		List<Persoon> personen = new ArrayList<>();
		try (Scanner scanner = new Scanner(bestand)) {
			while (scanner.hasNext()) {
				int persoonNr = scanner.nextInt();
				scanner.nextLine();
				String voornaam = scanner.nextLine();
				String familienaam = scanner.nextLine();
				int aantalKinderen = scanner.nextInt();
				if (scanner.hasNext()) {
					scanner.nextLine();
				}
				personen.add(new Persoon(persoonNr, voornaam, familienaam, aantalKinderen));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return personen;
	}
}