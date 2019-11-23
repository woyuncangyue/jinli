package com.jinli.resource_service_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexPageController {
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello";
    }

    @RequestMapping("/testlogin")
    public String login(){
        return "login.html";
    }
}
