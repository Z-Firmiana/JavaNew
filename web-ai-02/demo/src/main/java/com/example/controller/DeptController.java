package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Dept;
import com.example.pojo.Result;
import com.example.service.DeptService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/depts")
    public Result list() {
        System.out.println("查询全部部门数据");
        List<Dept> deptList = deptService.findAll();
        return Result.success(deptList);
    }

}
