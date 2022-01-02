package org.atilla.atillaadhesion.dao;

import java.util.List;

import org.atilla.atillaadhesion.entity.Adherant;

public interface AdherantDAO {
	
	public List<Adherant> getAdherants();
	public Adherant getAdherant(int id); 
	public void saveAdherant(Adherant adherant);
	public void deleteAdherant(int id);
}
