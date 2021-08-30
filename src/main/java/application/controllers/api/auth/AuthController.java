package application.controllers.api.auth;

import application.data.*;
import application.entities.User;
import application.services.UserService;
import application.config.jwt.JwtProvider;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
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
    @Operation(summary = "Логін користувача")
    public AuthLoginResponse login(@RequestBody AuthLoginRequest request){
        User user = userService.findByEmailAndPassword(request.getLogin(), request.getPassword());
        if(user == null){
            return new AuthLoginResponse(
                false,
                null,
                "",
                "",
                "",
                false,
                "User not found"
            );
        }

        String token = jwtProvider.generateToken(user.getEmail());
        return new AuthLoginResponse(
                true,
                token,
                user.getFirstName(),
                user.getLastName(),
                user.getUserRole().toString(),
                user.isEmailConfirmed(),
                null);
    }

    @PostMapping("/refreshtoken")
    @SecurityRequirement(name = "authAPI")
    @Operation(summary = "Оновлення строку дії наявного токену у користувача")
    public String refreshToken(@RequestHeader AuthRefreshValidateTokenHeaderRequest header, @RequestBody AuthRefreshValidateTokenBodyRequest body){
        return "Refresh";
    }

    @PostMapping("/logout")
    @SecurityRequirement(name = "authAPI")
    @Operation(summary = "Вихід з системи")
    public String logout(@RequestHeader AuthLogoutHeaderRequest header){
        return "logout";
    }

    @PostMapping("/validateToken")
    @SecurityRequirement(name = "authAPI")
    @Operation(summary = "Валідація наявного токену у користувача")
    public String validateToken(@RequestHeader AuthRefreshValidateTokenHeaderRequest header, @RequestBody AuthRefreshValidateTokenBodyRequest body){
        return "Refresh";
    }
}
