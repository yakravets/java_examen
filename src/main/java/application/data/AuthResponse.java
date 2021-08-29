package application.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {
    private String token;
    private String firstName;
    private String lastName;
    private String role;
    private boolean confirmed;
}

