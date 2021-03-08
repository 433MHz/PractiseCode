package pl.krystian.JWT;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepo extends JpaRepository<User, Long> {

	User findByLogin(String username);
}
