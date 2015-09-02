package be.vdab.daos;

import java.util.List;

import be.vdab.entities.Persoon;

public interface PersoonDAO{

	List<Persoon> findAll();
}
