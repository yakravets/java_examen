package application.controllers.api.auth;

import application.data.AuthRequest;
import application.data.AuthResponse;
import application.entities.User;
import application.services.UserService;
import application.config.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class AuthController {

    @Autowired
    private UserService userService;

    @Autowired
    private JwtProvider jwtProvider;

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request){
        User user = userService.findByEmailAndPassword(request.getLogin(), request.getPassword());
        String token = jwtProvider.generateToken(user.getEmail());
        return new AuthResponse(
                token,
                user.getFirstName(),
                user.getLastName(),
                user.getUserRole().toString(),
                user.isEmailConfirmed());
    }

    @PostMapping("/logout")
    public String logout(){
        return "logout";
    }
}
