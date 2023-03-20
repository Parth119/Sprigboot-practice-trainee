package com.htrap.ParthBhatiaProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @GetMapping("/")
    public String getMessage(){
        return "Hello Parth!";
    }
}
