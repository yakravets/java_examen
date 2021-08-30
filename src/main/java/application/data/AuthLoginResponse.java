package application.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthLoginResponse {
    private boolean success;
    private String token;
    private String firstName;
    private String lastName;
    private String role;
    private boolean confirmed;
    private String message;
}

