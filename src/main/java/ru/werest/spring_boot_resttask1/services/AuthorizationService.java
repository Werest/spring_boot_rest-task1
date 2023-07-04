package ru.werest.spring_boot_resttask1.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.werest.spring_boot_resttask1.exception.InvalidCredentials;
import ru.werest.spring_boot_resttask1.exception.UnauthorizedUser;
import ru.werest.spring_boot_resttask1.model.Authorities;
import ru.werest.spring_boot_resttask1.repository.UserRepository;
import ru.werest.spring_boot_resttask1.requests.UserRequest;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorizationService {
    //@Autowired - можно ли так?
    UserRepository userRepository;

    public List<Authorities> getAuthorities(UserRequest request) {
        String user = request.getUser();
        String password = request.getPassword();

        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
