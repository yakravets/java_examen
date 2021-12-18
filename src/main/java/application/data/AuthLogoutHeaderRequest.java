package application.data;
import lombok.Data;

@Data
public class AuthLogoutHeaderRequest {
    private String token;
}
