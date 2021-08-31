package application.controllers.api.auth;

import application.data.RegistrationRequest;
import application.data.RegistrationResponse;
import application.entities.User;
import application.entities.UserRole;
import application.repositories.UserRoleRepository;
import application.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@RestController
@RequestMapping("/api/v1")
public class RegisterController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @PostMapping("/register")
    public RegistrationResponse register(@RequestBody @Valid RegistrationRequest request){

        User user = userService.findByEmail(request.getEmail());
        if (user != null){

            return new RegistrationResponse(
                    false,
                    "This email is already registered!"
            );
        }

        UserRole role = userRoleRepository.findByName("ROLE_USER");
        Date date = Date.from(LocalDate.now()
                .atStartOfDay(ZoneId.systemDefault())
                .toInstant());

        user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setUserRole(role);
        user.setDataRegistration(date);
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmailConfirmed(true);
        user.setActive(true);

        userService.saveUser(user);

        return new RegistrationResponse(
                true,
                null
        );

    }
}
