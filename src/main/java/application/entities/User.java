package application.entities;

import lombok.*;
import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Date dataRegistration;
    private boolean emailConfirmed;
    private boolean active;
    private boolean blocked;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private UserRole userRole;
}
