package co.gc.tasklist.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class TaskDao {

	@PersistenceContext
	private EntityManager entityManager;
	
}
