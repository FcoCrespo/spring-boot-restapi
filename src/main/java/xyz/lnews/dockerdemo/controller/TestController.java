package xyz.lnews.dockerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
		
	@GetMapping("/")
    public String get0(){
        return "hola!";
    }
    
    @GetMapping("/hello")
    public String getHello(){
        return "hola!";
    }

}
