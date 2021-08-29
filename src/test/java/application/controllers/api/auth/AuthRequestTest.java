package application.controllers.api.auth;

import application.data.AuthRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AuthRequestTest {

    @Test
    void TestLogin() {

        AuthRequest request = new AuthRequest();
        request.setLogin("123456");
        Assertions.assertEquals("123456", request.getLogin());

    }

    @Test
    void TestPassword() {
        AuthRequest request = new AuthRequest();
        request.setPassword("123456");
        Assertions.assertEquals("123456", request.getPassword());
    }
}