package application.springboot.controllers.api;

import application.springboot.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegisterController {

    private final UserRepository userRepository;

    public RegisterController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
