package dao;

import models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class UserDao {

    private final Session session;

    public UserDao() {
        this.session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
    }

    public void closeSession()
    {
        session.close();
    }

    public User findById(int id) {
        return session.get(User.class, id);
    }

    public void save(User user) {
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
    }

    public void update(User user) {
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
    }

    public void delete(User user) {
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
    }

    public List<User> findAll() {
        return (List<User>) session.createQuery("From User").list();
    }
}