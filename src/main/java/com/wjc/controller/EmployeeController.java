package com.wjc.controller;

import com.wjc.domain.Employee;
import com.wjc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/employee")
    public Result getAllEmployee()
    {
        List<Employee> employees=employeeService.getAllEmployee();
        int code=(employees!=null) ?Code.GET_OK:Code.GET_ERR;
        String msg=(employees!=null) ?null:"查询失败";
        return new Result(code,employees,msg);
    }

    @GetMapping("/employee/{employee_id}")
    public Result getAEmployee(@PathVariable int employee_id)
    {
        Employee employee=employeeService.getAEmployee(employee_id);
        int code=(employee!=null) ?Code.GET_OK:Code.GET_ERR;
        String msg=(employee!=null) ?null:"查询失败";
        return new Result(code,employee,msg);
    }
    @PutMapping("/employee")
    public Result update(@RequestBody Employee employee) {
        boolean flag = employeeService.update(employee);

        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @PostMapping("/employee")
    public Result save(@RequestBody Employee employee) {
        boolean flag = employeeService.add(employee);

        return new Result(flag ? Code.ADD_OK : Code.ADD_ERR, flag);
    }


}
