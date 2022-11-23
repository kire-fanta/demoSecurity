package ssecurity.secu.Reposotory;

import jdk.internal.icu.text.UnicodeSet;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import ssecurity.secu.MODELE.Role;
import ssecurity.secu.MODELE.user;

public interface userRepo extends JpaRepository<User,Long> {

    user findByIdUsername(String username);
}
