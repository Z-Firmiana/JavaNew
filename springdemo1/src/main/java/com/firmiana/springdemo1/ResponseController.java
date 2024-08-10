package com.firmiana.springdemo1;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class ResponseController {
    
    @RequestMapping("/response")
    public void response(HttpServletResponse response) throws IOException {
        // 设置响应状态码
        response.setStatus(401);
        // 设置响应头
        response.setHeader("name", "firmiana s");
        // 设置响应体
        response.getWriter().write("Hello Response~");
    }

    @RequestMapping("/response2")
    public ResponseEntity<String> response2() {
        // 设置响应状态码
        // 设置响应头
        // 设置响应体
        return ResponseEntity.status(401).header("name", "firmiana s").body("Hello Response2~");
    }
    
}
