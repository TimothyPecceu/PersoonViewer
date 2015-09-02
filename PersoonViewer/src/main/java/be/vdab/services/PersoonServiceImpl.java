package be.vdab.services;

import java.util.List;

import be.vdab.daos.PersoonDAO;
import be.vdab.entities.Persoon;

class PersoonServiceImpl implements PersoonService {

	private final PersoonDAO persoonDAO;
	
	PersoonServiceImpl(PersoonDAO persoonDAO) {
		this.persoonDAO = persoonDAO;
	}
	
	@Override
	public List<Persoon> findAll(){
		return persoonDAO.findAll();
	}
}
