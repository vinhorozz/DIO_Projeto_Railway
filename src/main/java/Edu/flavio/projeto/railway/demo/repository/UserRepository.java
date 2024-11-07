package Edu.flavio.projeto.railway.demo.repository;

import Edu.flavio.projeto.railway.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
