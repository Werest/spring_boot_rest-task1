package ru.werest.spring_boot_resttask1.controller;

import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.werest.spring_boot_resttask1.model.Authorities;
import ru.werest.spring_boot_resttask1.requests.UserRequest;
import ru.werest.spring_boot_resttask1.services.AuthorizationService;

import java.util.List;

@RestController
@AllArgsConstructor
public class AuthorizationController {
    //@Autowired - можно ли так?
    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Validated UserRequest request) {
        return service.getAuthorities(request);
    }
}
