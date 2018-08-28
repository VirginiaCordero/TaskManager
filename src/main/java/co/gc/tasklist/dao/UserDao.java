package co.gc.tasklist.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDao {
	
	@PersistenceContext
	private EntityManager entityManager;

//	public List<User> findAll() {
//		return entityManager.createQuery("FROM User", User.class).getResultList();
//	}
//	
//	public User findById(long id) {
//		return entityManager.find(User.class, id);
//	}
//
//	public void create(User user) {
//		entityManager.persist(user);
//	}
//	
//	public void delete(long id) {
//		User product = entityManager.getReference(User.class, id);
//		entityManager.remove(product);
//	}
//	
//	public void edit(User user) {
//		entityManager.merge(user);
//	}
}
