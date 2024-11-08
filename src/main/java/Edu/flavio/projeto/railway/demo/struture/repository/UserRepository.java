package Edu.flavio.projeto.railway.demo.struture.repository;

import Edu.flavio.projeto.railway.demo.struture.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
