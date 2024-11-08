package ProjectSpringWeb.repository;

import ProjectSpringWeb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

//  findByUsername se traduce in SELECT * FROM users WHERE username = username
}
