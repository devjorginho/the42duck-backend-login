package com.the42duck.the42duckbackend.controller;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.the42duck.the42duckbackend.model.User;
import com.the42duck.the42duckbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/add")
    public String addUser(@RequestParam String username, @RequestParam String email, @RequestParam String password) {
        User user = new User(username, email, passwordEncoder.encode(password));
        userRepository.save(user);
        return "Usuário salvo com ID: " + user.getId();
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
