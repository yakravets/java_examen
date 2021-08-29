package application.repositories;

import application.entities.User;
import application.entities.UserRole;
import org.springframework.data.repository.CrudRepository;

public interface  UserRepository extends CrudRepository<User, Long> {

    User findByEmail(String email);

    User findByUserRole(UserRole userRole);
}
