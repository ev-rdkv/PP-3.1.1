package web.PP_311.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT u FROM User u ORDER BY u.id", User.class).getResultList();
    }
    @Override
    public User getUserById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }


    @Override
    public void removeUserById(long id) {
        entityManager.remove(entityManager.find(User.class, id));
    }


    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }
}

