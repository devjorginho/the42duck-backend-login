package com.the42duck.the42duckbackend.repository;

import com.the42duck.the42duckbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Podemos adicionar métodos personalizados aqui depois
}
