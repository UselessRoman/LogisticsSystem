package com.wjc.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeDao
{
    @Select(" select password from employee where employee_id =#{employee_id}")
    public String getPasswordById(int emplyee_id);

    @Select(" select employee_id,employee_name,salary from employee where employee_id=#{id}")
    public List<String> getInfoById(int employee_id);

    @Select(" select dept from employee where employee_id=#{employee_id}")
    public String getDept(int employee_id);
}
