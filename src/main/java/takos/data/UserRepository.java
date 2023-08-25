package takos.data;

import org.springframework.data.repository.CrudRepository;
import takos.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
