package marie.teck.gestiondestock.repository;

import marie.teck.gestiondestock.model.Roles;
import marie.teck.gestiondestock.model.security.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolesRepository extends JpaRepository<Roles, Integer> {
    Optional<Roles> findByRoleName(Role roleName);
}
