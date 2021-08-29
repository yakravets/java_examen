package application.controllers.api.auth;

import application.data.RegistrationRequest;
import application.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class RegisterController {

    private final UserRepository userRepository;

    public RegisterController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/register")
    public String register(@RequestBody @Valid RegistrationRequest registrationRequest){

        return "register";
    }
}
