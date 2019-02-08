package com.lti.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.lti.entity.CarPart;

@Component("carPartDao4")
public class CarPartsDaoImpl4 implements CarPartsDao {
	
//@Autowired-This doesn't work in case of injecting entityManager object
@PersistenceContext //EntityManagerFactory object is created through this
private EntityManager entityManager;

@Transactional 		//EntityTransaction code is not needed here
	public void addNewPart(CarPart cp1) {
		entityManager.persist(cp1);
	}
		
	
public List<CarPart> getAvailableParts() {
	
	Query q=entityManager.createQuery("select cp from CarPart as cp");
	return q.getResultList();
	
}
}