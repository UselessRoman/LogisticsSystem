package com.wjc.service.impl;

import com.wjc.dao.CustomerDao;
import com.wjc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public int getCustomerIdByTel(String tel) {
        return customerDao.getCustomerIdByTel(tel);
    }
}
