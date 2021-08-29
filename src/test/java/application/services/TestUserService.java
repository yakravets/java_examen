package application.services;

import application.entities.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestUserService {

    @Test
    void TestService(){

        UserService userService = new UserService();
        Assertions.assertNotNull(userService);
    }

    @Test
    void TestFindByEmail() {

        UserService userService = new UserService();
        Assertions.assertNotNull(userService);

        User user = userService.findByEmail("admin");
        Assertions.assertNotNull(user);

    }

    @Test
    void TestValidLogin() {
        UserService userService = new UserService();
        Assertions.assertNotNull(userService);

        String loginValid = "admin";
        String passwordValid = "admin";

        User userValid = userService.findByEmailAndPassword(loginValid, passwordValid);
        Assertions.assertNotNull(userValid);
    }

    @Test
    void TestInvalidLogin() {
        UserService userService = new UserService();
        Assertions.assertNotNull(userService);

        String loginInvalid = "test";
        String passwordInvalid = "test";

        User userInvalid = userService.findByEmailAndPassword(loginInvalid, passwordInvalid);
        Assertions.assertNull(userInvalid);
    }
}