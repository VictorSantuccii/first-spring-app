package com.santucci.first_spring_app.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.santucci.domain.User;
import com.santucci.first_spring_app.service.HelloWorldService;


@RestController
@RequestMapping("hello-world")
@Profile("dev")
public class HelloWorldController {

    // @Autowired
    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    //post, put, delete, get, options, head, patch
    @GetMapping
    public String helloWorld() {
    return helloWorldService.helloWorld("Santucci");
    }

    @PostMapping("")
    public String helloWorldPost(@RequestBody User body) {
    return "Hello World " + body.getName();

    }

    @PostMapping("/{id}")
    public String helloWorldPost2(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
    return "Hello World " + body.getName() + id + filter;

    }
}


