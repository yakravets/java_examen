package application.springboot.controllers.api;

import application.springboot.repositories.UserRepository;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

public class TestAuthController {

    @Resource
    private UserRepository userRepository;

    @Test
    public void TestLogin() {
        AuthController authController = new AuthController(this.userRepository);
        Assert.assertNotNull(authController);

        Assert.assertEquals("login", authController.login());
    }

    @Test
    public void TestLogout() {
        AuthController authController = new AuthController(this.userRepository);
        Assert.assertNotNull(authController);

        Assert.assertEquals("logout", authController.logout());
    }
}
