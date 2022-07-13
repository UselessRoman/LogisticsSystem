package com.wjc.service.impl;

import com.wjc.dao.CarDao;
import com.wjc.domain.Car;
import com.wjc.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public Car getByID(int id) {
        return carDao.getByID(id);
    }

    @Override
    public List<Car> getAvailable() {
        return carDao.getAvailable();
    }
}
