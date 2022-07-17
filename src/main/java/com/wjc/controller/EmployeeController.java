package com.wjc.controller;

import com.wjc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

//    @PostMapping
//    public Result verifyLogin()
//    {
//        boolean result=employeeService.verifyLogin();
//        int code;
//        String msg;
//
//        return new Result(code,result,msg);
//    }


}
