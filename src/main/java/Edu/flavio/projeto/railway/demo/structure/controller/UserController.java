package Edu.flavio.projeto.railway.demo.structure.controller;


import Edu.flavio.projeto.railway.demo.structure.model.User;
import Edu.flavio.projeto.railway.demo.structure.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping("/")
    public String home() {
        return "Hello, Spring Boot!";
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        return ResponseEntity.ok(userService.findByID(id));
    }
    @PostMapping
    public ResponseEntity<User>createAccount(@RequestBody User userToAdd){
        var userCreated= userService.addUser(userToAdd);
        //vamos adicionar uma função do Spring que retorna o endereço do recurso solicita (prática comum nas APIRestful)
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);
    }
   /*
    // Exemplo de implementação simples, somente para testar a diferença
    @PostMapping
    public ResponseEntity<User> createAccount(@RequestBody User user){
        return ResponseEntity.ok(userService.addUser(user));
    }*/
}
