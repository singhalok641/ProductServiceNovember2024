package com.ecommerce.productservicenovember2024.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// This class will now be hosting a set of HTTP API's
// Get Request, Put Request, delete, Post
@RestController
@RequestMapping("/say") // productController -> /product
public class SampleController {

    // localhost:8080/say/hello
    @GetMapping("/hello/{name}/{times}")
    public String sayHello(@PathVariable("name") String name,
                           @PathVariable("times") int count){

        // HW: Read what is StringBuilder
        // And how it is different from String
        StringBuilder output = new StringBuilder();
        for(int i=0; i<count; i++){
            output.append("hello " + name);
        }
        return output.toString();
    }

    // localhost:8080/say/bye
    @GetMapping("/bye")
    public String sayBye(){
        return "Bye ";
    }
}

/*
localhost -> 127.0.0.1
port number as a entry where someone is listening for your request.

http://localhost:2345/say/hello


www.scaler.com/instructor/meetings/i/rest-apis-http-27/
india/ banglore/ techpack/ scaler/door-33

This domain name maps to some ip address: 123.12.13.122

 */