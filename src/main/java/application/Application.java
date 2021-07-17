package application;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
    private static final String ConfigFile = "hibernate-pg.cfg.xml";
    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }
}
