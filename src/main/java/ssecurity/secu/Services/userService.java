package ssecurity.secu.Services;

import ssecurity.secu.MODELE.Role;
import ssecurity.secu.MODELE.user;

import java.util.List;

public interface userService {
    user saveUser (user User);
    Role saveRole(Role role);
    void addRoleTouser(String username , String roleName );
    user getUser(String username,String roleName);

    user getUser(String username);

    List<user> getUsers();
}
