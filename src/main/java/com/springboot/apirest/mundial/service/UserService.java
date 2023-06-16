package com.springboot.apirest.mundial.service;

import com.springboot.apirest.mundial.service.dto.user.login.LoginRequest;
import com.springboot.apirest.mundial.service.dto.user.login.LoginResponse;
import com.springboot.apirest.mundial.service.dto.user.register.RegisterUserRequest;
import com.springboot.apirest.mundial.service.dto.user.register.RegisteredUserResponse;

public interface UserService {
    //se crea un registro y lo que retorna es la respuesta como en la documentación
    RegisteredUserResponse create(RegisterUserRequest user);

    LoginResponse login(LoginRequest loginRequest);
}
