package ru.sbrf.efs.kubertest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class MyController {

    @GetMapping
    public ResponseEntity<String> getInfo() {
        return new ResponseEntity<>("Tutto bene Eugenio", HttpStatus.OK);
    }
}
