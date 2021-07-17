package application.springboot.loader;

import application.springboot.entities.Access;
import application.springboot.entities.User;
import application.springboot.entities.UserRole;
import application.springboot.repositories.UserRepository;
import application.springboot.repositories.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;

    @Autowired
    public DatabaseLoader(UserRepository userRepository, UserRoleRepository userRoleRepository) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        User admin = new User();
        admin.setFirstName("Admin");
        admin.setLastName("Admin");
        admin.setActive(true);
        admin.setEmail("admin");
        admin.setPassword("admin");

        if(this.userRepository.count()==0)
        {
            this.userRepository.save(admin);
        }

        if(this.userRoleRepository.count()==0)
        {
            this.userRoleRepository.save(new UserRole("Administrator", Access.All, "*", admin));
        }
    }
}
