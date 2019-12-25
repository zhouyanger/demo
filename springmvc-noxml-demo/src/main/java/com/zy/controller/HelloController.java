package com.zy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
    //请求是/hello,返回的试图名是index，dispatcherServlet会根据springmvc的配置去找WEB-INF/views/index.jsp页面
    @GetMapping("/hello")
    public String hello(){
        return "index";
    }

}
