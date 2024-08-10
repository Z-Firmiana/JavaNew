package com.firmiana.springdemo1;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class RequestServerControler {
    
    @RequestMapping("/request")
    public String requeset(HttpServletRequest request) {
        // 获取请求方式
        String method = request.getMethod();
        System.out.println("请求方式：" + method);
        // 获取请求参数

        String name = request.getParameter("name");
        System.out.println("name: " + name);
        return "Hello " + name + "~";

    }
    

}
