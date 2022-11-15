package com.example.codefordisaster.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class login {
    @RequestMapping("/test")
    public String test(){
        return "success";
    }
}
