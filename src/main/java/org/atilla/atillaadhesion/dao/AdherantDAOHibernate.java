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
	public List<Adherant> getAdherants() {
		
		Session session = entityManager.unwrap(Session.class); //session hibernate
		Query<Adherant> query = session.createQuery("from Adherant", Adherant.class);
		List<Adherant> adherants = query.getResultList();
		
		
		return adherants;
	}

  @Override
	public String getMailingList(){
		Session session = entityManager.unwrap(Session.class); //session hibernate
		Query<Adherant> query = session.createQuery("from Adherant where mailing_liste=1", Adherant.class);
		List<Adherant> adherants = query.getResultList();
		String MLstring = adherants.get(0).getEmail();
		for (Adherant adherant : adherants) {
			if (adherant!=adherants.get(0)){
				MLstring = MLstring+','+adherant.getEmail();
			}
		}
		return MLstring;
	}
  
  @Override
	public String getMailingListCotisants(){
		Session session = entityManager.unwrap(Session.class); //session hibernate
		Query<Adherant> query = session.createQuery("from Adherant where mailing_liste=1 and cotisant=1", Adherant.class);
		List<Adherant> adherants = query.getResultList();
		String MLstring = adherants.get(0).getEmail();
		for (Adherant adherant : adherants) {
			if (adherant!=adherants.get(0)){
				MLstring = MLstring+','+adherant.getEmail();
			}
		}
		return MLstring;
	}

	@Override
	public Adherant getAdherant(int id) {
		Session session = entityManager.unwrap(Session.class);
		Adherant adherant = session.get(Adherant.class,id);
		return adherant;
	}

	@Override
	//if id = 0, it'll save else it will update
	public void saveAdherant(Adherant adherant) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(adherant);
		
	}

	@Override
	public void deleteAdherant(int id) {
		
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("delete from Adherant where id = :adherantId");
		query.setParameter("adherantId", id);
		query.executeUpdate();
		
	}
	
}
