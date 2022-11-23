package ssecurity.secu.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ssecurity.secu.MODELE.Role;
import ssecurity.secu.MODELE.user;
import ssecurity.secu.Reposotory.RoleRepo;
import ssecurity.secu.Reposotory.userRepo;

import javax.transaction.Transactional;
import java.util.List;
@Service
@AllArgsConstructor
@Transactional
@Slf4j
public class userimplementation implements userService {
    private final userRepo UserRepo;
    private final RoleRepo roleRepo;

    @Override
    public user saveUser(user User) {
        log.info("Saving new user {} to the databasse ", User.getName());
        return roleRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role{} to the databasse ", role.getNom());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleTouser(String username, String roleName) {
        log.info("Adding role {} to user {}, roleName , username ");
user User =UserRepo.findByIdUsername(username);
Role role= roleRepo.findByName(roleName);
User.getRoles().add(role);

    }

    @Override
    public user getUser(String username, String roleName) {
        return null;
    }

    @Override
    public user getUser(String username) {
        log.info("Fetching user {}", username);
        return UserRepo.findByIdUsername(username);
    }

    @Override
    public List<user> getUsers() {
        log.info("Fetching all users");
        return userRepo.findAll();
    }
}
