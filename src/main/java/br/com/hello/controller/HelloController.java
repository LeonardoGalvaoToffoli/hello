package br.com.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello!!";
    }

    @GetMapping("hellohtml")
    public String sayHelloHtml(){
        return "<html>" +
                "<body>" +
                "<h1>Hello World!</h1>" +
                "<hr>"+
                "<p> Teste HTML <p>"+
                "</body>" +
                "</html>";
    }
}
