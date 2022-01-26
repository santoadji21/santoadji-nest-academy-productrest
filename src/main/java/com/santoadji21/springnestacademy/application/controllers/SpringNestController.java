package com.santoadji21.springnestacademy.application.controllers;

import com.santoadji21.springnestacademy.dto.ResponseGlobal;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringNestController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/test")
    public ResponseEntity<ResponseGlobal> testdto() {
        var response = new ResponseGlobal();
        response.setCode(0);
        response.setStatus("OK");
        response.setData("Oke Ini User");

        return new ResponseEntity<ResponseGlobal>(response, HttpStatus.OK);

    }
}

