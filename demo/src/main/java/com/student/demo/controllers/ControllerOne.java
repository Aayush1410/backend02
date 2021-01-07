package com.student.demo.controllers;


import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
public class ControllerOne {



    @RequestMapping(value = "/hello1/{name}", method = RequestMethod.GET)
    public String hello1(@PathVariable String name) {
        String msg = "hello " + name + " I am ControllerOne ";
        System.out.println(msg);

        return msg;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String hello2(@RequestParam String name) {
        String msg = "hello " + name;
        System.out.println(msg);
        return msg;
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello3(@RequestBody String name) {
        String msg = "hello " + name;
        System.out.println(msg);
        return msg;
    }

    @PostConstruct
    public void init() {
        System.out.println(this.getClass().getSimpleName());
    }

}
