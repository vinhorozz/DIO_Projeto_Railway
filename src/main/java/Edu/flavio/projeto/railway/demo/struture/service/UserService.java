package Edu.flavio.projeto.railway.demo.struture.service;

import Edu.flavio.projeto.railway.demo.struture.model.User;

public interface UserService {

    //*todos os método dentro da interface são públicos, não necessitam declaração

    User findByID(Long id);

    User addUser(User userToCreate);

}
