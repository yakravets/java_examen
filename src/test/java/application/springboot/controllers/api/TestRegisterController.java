package application.springboot.controllers.api;

import application.springboot.repositories.UserRepository;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

public class TestRegisterController {

    @Resource
    private UserRepository userRepository;

    @Test
    public void TestGetRegister() {
        RegisterController registerController = new RegisterController(this.userRepository);
        Assert.assertNotNull(registerController);

        Assert.assertEquals("register", registerController.register());
    }
}
