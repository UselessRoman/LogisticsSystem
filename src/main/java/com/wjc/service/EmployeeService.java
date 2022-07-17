package com.wjc.service;

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


}
