package com.wjc.service.impl;

import com.wjc.dao.EmployeeDao;
import com.wjc.domain.Employee;
import com.wjc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl  implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public boolean verifyLogin(int employee_id, String password) {
        String correctPassword=employeeDao.getPasswordById(employee_id);
        return correctPassword.equals(password);
    }

    @Override
    public String getDept(int employee_id) {
        return employeeDao.getDept(employee_id);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeDao.getAllEmployee();
    }

    @Override
    public Employee getAEmployee(int employee_id) {
        return employeeDao.getAEmployee(employee_id);
    }

    @Override
    public boolean update(Employee employee) {
      return employeeDao.update(employee)>0;
    }

    @Override
    public boolean add(Employee employee) {
        return employeeDao.add(employee)>0;
    }
}
