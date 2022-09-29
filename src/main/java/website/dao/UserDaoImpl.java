package website.dao;

import org.springframework.stereotype.Repository;
import website.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> findAllUser() {
        TypedQuery<User> query = entityManager.createQuery("FROM User", User.class);
        return query.getResultList();
    }

    @Override
    public void createUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUser(User updateUser) {
        entityManager.merge(updateUser);
    }

    @Override
    public void deleteUser(int id) {
        entityManager.remove(entityManager.find(User.class, id));
        //      entityManager.remove(findUser(id));
    }

    @Override
    public User findUser(int id) {
//        TypedQuery<User> query = entityManager.createQuery("FROM User WHERE id = :id", User.class).setParameter("id", id);
//        return query.getSingleResult();
        return entityManager.find(User.class, id);
    }
}
