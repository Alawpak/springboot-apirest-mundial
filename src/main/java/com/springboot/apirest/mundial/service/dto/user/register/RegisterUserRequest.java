package com.springboot.apirest.mundial.service.dto.user.register;

import lombok.Data;

@Data
public class RegisterUserRequest {

    private String name;
    private String email;
    private String password;
    private String passwordConfirm;
}
