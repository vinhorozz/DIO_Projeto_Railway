package Edu.flavio.projeto.railway.demo.structure.repository;

import Edu.flavio.projeto.railway.demo.structure.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);
}
