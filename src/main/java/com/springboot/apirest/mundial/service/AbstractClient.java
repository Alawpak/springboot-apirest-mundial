package com.springboot.apirest.mundial.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

//Clase que contiene cosas comunes que van a utilizar todos los clientes que se conectan a la api rest
public abstract class AbstractClient {

    @Value("${worldcup.base-url}")
    protected String baseUrl;

    protected final RestTemplate restTemplate;

    protected AbstractClient(RestTemplate restTemplate){ this.restTemplate = restTemplate; }


}
