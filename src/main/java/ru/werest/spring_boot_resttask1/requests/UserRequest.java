package ru.werest.spring_boot_resttask1.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRequest {
    @NotBlank
    @Size(min = 1)
    private String user;

    @NotBlank
    @Size(min = 1)
    private String password;
}
