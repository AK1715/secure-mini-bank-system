package com.bankApplication.bank_application;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> Home(){
        return ResponseEntity.ok("Spring Boot Backend is Live know on Vercel🚀✅");
    }

}
