package com.springboot.apirest.mundial.service;

import com.springboot.apirest.mundial.service.dto.user.login.LoginRequest;
import com.springboot.apirest.mundial.service.dto.user.login.LoginResponse;
import com.springboot.apirest.mundial.service.dto.user.register.RegisterUserRequest;
import com.springboot.apirest.mundial.service.dto.user.register.RegisteredUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//api para logins
@Slf4j
@Service
public class UserServiceImpl extends AbstractClient implements UserService {


    protected UserServiceImpl(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public RegisteredUserResponse create(RegisterUserRequest user) {
        String uri = baseUrl + "/user";
        log.info("Going to create {}", user);

        //realiza una operación post sobre una api rest, le pasamos lo necesitado
        //ResponseEntity devuelve toda la respuesta de un http: header, body, encabezados, uri, status
        ResponseEntity<RegisteredUserResponse> response = restTemplate.postForEntity(uri, user, RegisteredUserResponse.class);

        //is2xx quiere decir si es un status 200 correcto
        if(response.getStatusCode().is2xxSuccessful()){
            log.info("Successfully user creation: {}", response.getBody().getStatus());
            return response.getBody();
        }
        log.error("Error in user creation - httpStatus was: {}", response.getStatusCode());
        throw new RuntimeException("Error");
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        return null;
    }
}
