package edu.cit.dost_scholarlink.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String print(){
        return "Hello, JAMES SILANGAN";
    }
}