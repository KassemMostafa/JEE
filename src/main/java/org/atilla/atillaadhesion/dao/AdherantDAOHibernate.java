package org.atilla.atillaadhesion.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.atilla.atillaadhesion.entity.Adherant;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AdherantDAOHibernate implements AdherantDAO {
	
	private EntityManager entityManager; //moins de config à faire par rapport à SessionFactory
	
	@Autowired
	public AdherantDAOHibernate(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional //gère automatiquement les transactions : pas de commit à faire pour chaque requête
	public List<Adherant> getAdherants() {
		
		Session session = entityManager.unwrap(Session.class); //session hibernate
		Query<Adherant> query = session.createQuery("from Adherant", Adherant.class);
		List<Adherant> adherants = query.getResultList();
		
		
		return adherants;
	}

}
