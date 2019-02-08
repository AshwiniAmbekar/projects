package com.lti.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//@Component("genericdao")
@Repository //for dao class
public class GenericRepository {
	@PersistenceContext
	protected EntityManager entityManager;
	
	@Transactional
	public void store(Object obj) {
		entityManager.merge(obj);
		entityManager.close();
	}

	public <E> E fetchById(Class<E> classname, Object pk) { // for all type of data
			E e = entityManager.find(classname, pk);
			return e;
	}

	public <E> List<E> fetchAll(Class<E> classname) { // for all type of data
			Query q = entityManager.createQuery("select obj from " + classname.getName() + " as obj");
			return q.getResultList();
	}

}
