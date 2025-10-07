package com.the42duck.the42duckbackend.controller;

import com.the42duck.the42duckbackend.model.User;
import com.the42duck.the42duckbackend.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    // Cadastro de usuário
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        Optional<User> existingUser = userService.findByUsername(user.getUsername());
        if (existingUser.isPresent()) {
            return ResponseEntity.badRequest().body("Usuário já existe");
        }
        userService.saveUser(user);
        return ResponseEntity.ok("Usuário registrado com sucesso!");
    }

    // Login simples
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        Optional<User> foundUser = userService.findByUsername(user.getUsername());
        if (foundUser.isPresent()) {
            return ResponseEntity.ok("Login bem-sucedido: " + foundUser.get().getUsername());
        } else {
            return ResponseEntity.status(401).body("Usuário não encontrado");
        }
    }
}
