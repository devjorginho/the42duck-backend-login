package com.the42duck.the42duckbackend;

import com.the42duck.the42duckbackend.model.User;
import com.the42duck.the42duckbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class The42DuckBackendApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(The42DuckBackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Exemplo genérico: cria usuário de teste se não existir
        if (userRepository.count() == 0) { // Só cria se o banco estiver vazio
            User user = new User("usuario_teste", "teste@teste.com", passwordEncoder.encode("123456"));
            userRepository.save(user);
            System.out.println("Usuário de teste criado!");
        }
    }
}
