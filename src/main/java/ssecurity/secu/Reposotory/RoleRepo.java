package ssecurity.secu.Reposotory;

import org.springframework.data.jpa.repository.JpaRepository;
import ssecurity.secu.MODELE.Role;

public interface RoleRepo extends JpaRepository<Role,Long>{
    Role findByName(String name);
}
