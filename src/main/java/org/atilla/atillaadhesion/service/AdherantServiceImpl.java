package org.atilla.atillaadhesion.service;

import java.util.List;

import org.atilla.atillaadhesion.dao.AdherantDAO;
import org.atilla.atillaadhesion.entity.Adherant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdherantServiceImpl implements AdherantService {

	private AdherantDAO adherantDAO;
	
	
	@Autowired
	public AdherantServiceImpl(AdherantDAO adherantDAO) {
		this.adherantDAO = adherantDAO;
	}

	@Override
	@Transactional
	public List<Adherant> getAdherants() {
		return adherantDAO.getAdherants();
	}

	@Override
	@Transactional
	public Adherant getAdherant(int id) {
		return adherantDAO.getAdherant(id);
	}

	@Override
	@Transactional
	public void saveAdherant(Adherant adherant) {
		adherantDAO.saveAdherant(adherant);
	}

	@Override
	@Transactional
	public void deleteAdherant(int id) {
		adherantDAO.deleteAdherant(id);
	}

}
