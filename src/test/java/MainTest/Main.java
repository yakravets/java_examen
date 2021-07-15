package MainTest;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Assert;
import org.junit.Test;
import utils.HibernateSessionFactoryUtil;

public class Main {

    @Test
    public void TestRegisterClasses() {

        String configName = "hibernate-pg-test.cfg.xml";

        Configuration configuration = HibernateSessionFactoryUtil.getConfiguration();
        Assert.assertNull(configuration);

        configuration = new Configuration().configure(configName);
        Assert.assertNotNull(configuration);

        HibernateSessionFactoryUtil.registerClasses(configuration);
    }
}
