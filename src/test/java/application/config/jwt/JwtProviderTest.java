package application.config.jwt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JwtProviderTest {

    @Test
    void TestProvider() {

        String login = "test";
        JwtProvider jwtProvider = new JwtProvider();
        jwtProvider.setJwtSecret("secret-12456");
        String token = jwtProvider.generateToken(login);

        Assertions.assertNotNull(token);
        Assertions.assertTrue(jwtProvider.validateToken(token));
        Assertions.assertEquals(login, jwtProvider.getLoginFromToken(token));

    }
}