package application.loader;

import application.entities.User;
import application.entities.UserRole;
import application.repositories.UserRepository;
import application.repositories.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    public DatabaseLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        UserRole roleAdmin = userRoleRepository.findByName("ROLE_ADMIN");
        if (roleAdmin == null){
            roleAdmin = new UserRole();
            roleAdmin.setName("ROLE_ADMIN");
            userRoleRepository.save(roleAdmin);

            UserRole roleUser = new UserRole();
            roleUser.setName("ROLE_USER");
            userRoleRepository.save(roleUser);
        }

        User admin = userRepository.findByUserRole(roleAdmin);
        if(admin == null){
            admin = new User();
            admin.setFirstName("Admin");
            admin.setLastName("Admin");
            admin.setActive(true);
            admin.setEmail("admin");
            admin.setPassword(passwordEncoder.encode("admin"));
            admin.setUserRole(roleAdmin);

            this.userRepository.save(admin);
        }
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }
}
