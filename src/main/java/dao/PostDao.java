package dao;

import models.Post;
import models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import java.util.List;

public class PostDao {

    private final Session session;

    public PostDao() {
        this.session = HibernateSessionFactoryUtil.getSessionFactory().openSession();;
    }

    public void closeSession()
    {
        session.close();
    }

    public Post findById(int id) {
        return session.get(Post.class, id);
    }

    public List<Post> findByUser(User user){

        List<Post> posts = session.createQuery("FROM Post where user = :user").setParameter("user", user).list();
        return posts;}

    public void save(Post post) {
        Transaction tx1 = session.beginTransaction();
        session.save(post);
        tx1.commit();
    }

    public void update(Post post) {
        Transaction tx1 = session.beginTransaction();
        session.update(post);
        tx1.commit();
    }

    public void delete(Post post) {
        Transaction tx1 = session.beginTransaction();
        session.delete(post);
        tx1.commit();
    }

    public List<Post> findAll() {
        return (List<Post>) session.createQuery("From Post ").list();
    }
}
