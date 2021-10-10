package com.gestionEmp.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.gestionEmp.entities.Employe;

@Repository
@Transactional(readOnly = true)
public class EmployeRepositoryCustomImpl implements EmployeRepositoryCustom{

	@PersistenceContext
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<Employe> getEmployeListByName(String name) {
		Query query = entityManager.createNativeQuery("SELECT * FROM employe WHERE name LIKE ?",Employe.class);
		query.setParameter(1, name + "%");
		return (List<Employe>) query.getResultList();
	}

	public Employe getEmployeByLogin(String login) {
		Query query = entityManager.createNativeQuery("SELECT * FROM employe WHERE login = ?",Employe.class);
		query.setParameter(1, login);
		
		return (Employe) query.getSingleResult();
	}

}
