package com.wjc.dao;

import com.wjc.domain.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface EmployeeDao {
    @Select(" select password from employee where employee_id =#{employee_id}")
    public String getPasswordById(int emplyee_id);

    @Select(" select employee_id,employee_name,salary from employee where employee_id=#{id}")
    public List<String> getInfoById(int employee_id);

    @Select(" select dept from employee where employee_id=#{employee_id}")
    public String getDept(int employee_id);

    @Select("select * from employee ")
    public List<Employee> getAllEmployee();

    @Select("select * from employee where employee_id=#{employee_id}")
    Employee getAEmployee(int employee_id);

    @Update("update employee set salary=#{salary}, dept=#{dept} where employee_id=#{employee_id} ")
    int update(Employee employee);


    @Insert("insert into employee (employee_name, salary, dept, password) values(#{employee_name}, #{salary}, #{dept}, #{password})")
    int add(Employee employee);
}
