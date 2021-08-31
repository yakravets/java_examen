package application.data;

import lombok.Data;
import javax.validation.constraints.NotEmpty;

@Data
public class RegistrationRequest {

    @NotEmpty
    private String email;
    @NotEmpty
    private String password;
    @NotEmpty
    private String confirm;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;

    private boolean agreement;
    @NotEmpty
    private String gender;
}