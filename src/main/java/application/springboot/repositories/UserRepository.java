package application.springboot.repositories;

import application.springboot.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface  UserRepository extends CrudRepository<User, Integer> {
}
