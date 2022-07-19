package com.wjc.service;

import com.wjc.domain.Employee;

import java.util.List;

public interface EmployeeService
{
    /**
     * 验证员工登录
     * @param employee_id 
     * @param password
     * @return boolean 
     * @create 2022/7/17 11:29
     */
    boolean verifyLogin(int employee_id,String password);


    /**
     * 查看员工部门
     * @param employee_id 
     * @return java.lang.String 
     * @create 2022/7/17 23:18
     */
    public String getDept(int employee_id);

    /**
     * 查询所有员工
     * @return List<Employee>
     * @create 2022/7/18 13:48
     */
    public List<Employee> getAllEmployee();

    Employee getAEmployee(int employee_id);

    boolean update(Employee employee);

    boolean add(Employee employee);
}
