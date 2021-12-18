package application.data;
import lombok.Data;

@Data
public class AuthRefreshValidateTokenHeaderRequest {
    private String token;
}
