package de.aittr.g_31_2_jwt.repository;

import de.aittr.g_31_2_jwt.domain.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByName(String name);
}