package ro.go.bogdan.medmanager.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.go.bogdan.medmanager.users.entities.RoleName;
import ro.go.bogdan.medmanager.users.entities.Roles;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Roles, Long> {
//    Optional<Roles> findByName(RoleName roleName);
}
