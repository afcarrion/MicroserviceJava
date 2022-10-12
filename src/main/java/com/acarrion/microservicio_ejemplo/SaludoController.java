package com.acarrion.microservicio_ejemplo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class SaludoController {

    @GetMapping(value = "Saludo", produces = MediaType.TEXT_PLAIN_VALUE)
    public String saludo() {
        return "Microservicio SpringBoot";
    }

    @GetMapping(value = "Saludo/{name}", produces = MediaType.TEXT_PLAIN_VALUE)
    public String saludo(@PathVariable("name") String name) {
        return "Bienvenido " + name;
    }
}
