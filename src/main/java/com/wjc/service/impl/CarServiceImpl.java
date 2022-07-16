package com.wjc.service.impl;

import com.wjc.dao.CarDao;
import com.wjc.dao.PackageDao;
import com.wjc.domain.Car;
import com.wjc.domain.Package;
import com.wjc.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Autowired
    private PackageDao packageDao;

    @Override
    public Car getByID(int id) {
        return carDao.getByID(id);
    }

    @Override
    public List<Car> getAvailable() {
        return carDao.getAvailable();
    }


    // TODO: 2022/7/15 装车的逻辑与算法
    @Override
    public void loadPackages() {
     /*   List<Package> packages=packageDao.getNeededToSend("成都","重庆");
        for (Package p:
            packages ) {
            p.setCar_id();
            packageDao.updateCarId(p);
        }*/
    }


    @Override
    public boolean setRepair(int id) {
        return carDao.setRepair(id) > 0;
    }

    @Override
    public boolean doRepair(int id) {
        return carDao.doRepair(id) > 0;
    }
}
