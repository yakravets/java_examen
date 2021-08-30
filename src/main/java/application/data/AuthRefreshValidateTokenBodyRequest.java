package application.data;
import lombok.Data;

@Data
public class AuthRefreshValidateTokenBodyRequest {
    private String refreshToken;
}
