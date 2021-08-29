package application.controllers.api.auth;

import application.repositories.UserRepository;
import org.junit.Test;

import javax.annotation.Resource;

public class TestRegisterController {

    @Resource
    private UserRepository userRepository;

    @Test
    public void TestGetRegister() {
//        RegisterController registerController = new RegisterController(this.userRepository);
//        Assert.assertNotNull(registerController);
//
//        Assert.assertEquals("register", registerController.register());
    }
}
