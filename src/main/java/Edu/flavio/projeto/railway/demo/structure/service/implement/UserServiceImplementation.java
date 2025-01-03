package Edu.flavio.projeto.railway.demo.structure.service.implement;


import Edu.flavio.projeto.railway.demo.structure.model.User;
import Edu.flavio.projeto.railway.demo.structure.repository.UserRepository;
import Edu.flavio.projeto.railway.demo.structure.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public User findByID(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User addUser(User userToCreate) {
            if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
                throw new IllegalArgumentException("This account already exists.") ;
            }
        return userRepository.save(userToCreate);
    }
}