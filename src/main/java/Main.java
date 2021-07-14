import models.Country;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Country country = new Country("Ukraine", "UA");
        Transaction tx1 = session.beginTransaction();
        session.save(country);
        tx1.commit();

        Country country1 = session.get(Country.class, 1);
        System.out.println(country1);
        session.close();

        System.out.println("OK");
    }
}
