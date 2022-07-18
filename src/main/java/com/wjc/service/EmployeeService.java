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


    /**
     * 查看员工部门
     * @param employee_id 
     * @return java.lang.String 
     * @create 2022/7/17 23:18
     */
    public String getDept(int employee_id);
}
