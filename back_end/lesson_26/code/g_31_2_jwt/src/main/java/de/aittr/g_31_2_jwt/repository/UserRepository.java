package de.aittr.g_31_2_jwt.repository;

import de.aittr.g_31_2_jwt.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}