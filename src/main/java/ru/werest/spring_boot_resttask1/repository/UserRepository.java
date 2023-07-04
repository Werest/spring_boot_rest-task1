package ru.werest.spring_boot_resttask1.repository;

import org.springframework.stereotype.Repository;
import ru.werest.spring_boot_resttask1.model.Authorities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if (user.equals("administrator") && password.equals("Nfujqef123Kaduhq")) {
            Collections.addAll(authorities, Authorities.WRITE, Authorities.READ, Authorities.DELETE);
        } else if (user.equals("user") && password.equals("user1234qwerty")) {
            Collections.addAll(authorities, Authorities.READ);
        } else if (user.equals("pavel") && password.equals("pavel1990")) {
            Collections.addAll(authorities, Authorities.READ, Authorities.WRITE);
        } else {
            return Collections.emptyList();
        }
        return authorities;
    }
}
