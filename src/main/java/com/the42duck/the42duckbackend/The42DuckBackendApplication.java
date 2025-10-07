package com.the42duck.the42duckbackend;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import com.the42duck.the42duckbackend.model.User;
import com.the42duck.the42duckbackend.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class The42DuckBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(The42DuckBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserRepository userRepository) {
        return args -> {
            // Criar um usuário de teste
            User user = new User("jorge", "jorge@example.com");
            userRepository.save(user);

            // Mostrar todos os usuários
            userRepository.findAll().forEach(u -> System.out.println(u.getUsername() + " - " + u.getEmail()));
        };
    }
}
