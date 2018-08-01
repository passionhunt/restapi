package com.passionhunt.ai.restapi.resources;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by i316579 on 31/07/18.
 */

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

    public String hello(){
        return "Hello World";
    }

    @PostMapping("/post")
    public String helloAdd(@RequestBody final String hello){
        return hello;
    }

    @PutMapping("/put")
    public String helloPut(@RequestBody final String helloput){
        return helloput;
    }
}
