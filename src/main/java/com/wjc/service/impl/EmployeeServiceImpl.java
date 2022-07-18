package com.wjc.service.impl;

import com.wjc.dao.EmployeeDao;
import com.wjc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
