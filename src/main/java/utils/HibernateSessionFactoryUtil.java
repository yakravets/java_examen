package utils;

import models.Airport;
import models.City;
import models.Country;
import models.Terminal;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    public static Configuration getConfiguration() {
        return configuration;
    }

    private static Configuration configuration;

    private HibernateSessionFactoryUtil() {}

    public static SessionFactory getSessionFactory(String configFilename) {
        if (sessionFactory == null) {
            try {
                configuration = new Configuration().configure(configFilename);
                registerClasses(configuration);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e) {
                System.out.println("Исключение!" + e);
            }
        }
        return sessionFactory;
    }

    public static void registerClasses(Configuration configuration)
    {
        configuration.addAnnotatedClass(Airport.class);
        configuration.addAnnotatedClass(City.class);
        configuration.addAnnotatedClass(Country.class);
        configuration.addAnnotatedClass(Terminal.class);
    }
}