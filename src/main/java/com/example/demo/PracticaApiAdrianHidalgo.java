package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.Map;



@RestController
public class PracticaApiAdrianHidalgo {
	@GetMapping("/hola")
    public Map <String, String> holaApi() {
        	
        return Collections.singletonMap("Mensaje", "Mi primera api que bieeeennnn");
    }
}