package Edu.flavio.projeto.railway.demo.structure.service;

import Edu.flavio.projeto.railway.demo.structure.model.User;

public interface UserService {

    //*todos os método dentro da interface são públicos, não necessitam declaração

    User findByID(Long id);

    User addUser(User userToCreate);

}
