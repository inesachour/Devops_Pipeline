package com.example.tp2_4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BonjourController {
    @RequestMapping("/")
    public String afficherMessage() {
        return "Bonjour";
    }
}
