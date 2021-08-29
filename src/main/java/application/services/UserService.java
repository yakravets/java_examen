package application.services;

import application.entities.User;
import application.entities.UserRole;
import application.repositories.UserRepository;
import application.repositories.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRoleRepository userRoleRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public User saveUser(User user){
        UserRole userRole = userRoleRepository.findByName("ROLE_USER");
        user.setUserRole(userRole);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public User findByEmailAndPassword(String email, String password){
        User user = findByEmail(email);
        if(user != null){
           if(passwordEncoder.matches(password, user.getPassword())){
               return  user;
           }
        }

        return  null;
    }
}
