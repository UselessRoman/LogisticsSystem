package com.wjc.service.impl;

import com.wjc.dao.CarDao;
import com.wjc.dao.LogDao;
import com.wjc.dao.PackageDao;
import com.wjc.domain.Car;
import com.wjc.service.CarService;
import com.wjc.utils.PriceCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;
    @Autowired
    private LogDao logDao;

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

    }


    @Override
    public boolean addRepair(Map<String, Object> map) {
        int car_id = Integer.parseInt((String) map.get("car_id"));
        int cost = Integer.parseInt((String) map.get("cost"));
        String description = (String) map.get("description");
        return carDao.setRepair(car_id) > 0 && logDao.addRepair(car_id, cost, description) > 0;
    }

    @Override
    public boolean doRepair(int car_id, int employee_id) {

        return carDao.doRepair(car_id) > 0 && logDao.doRepair(employee_id, car_id) > 0;
    }

    @Override
    public List<Map<String, Object>> getRepair() {
        return logDao.getRepair();
    }

    @Override
    public boolean doTransport(int car_id, String send_addr, String receive_addr, int employee_id) {


        int cost = PriceCalculator.calculate(send_addr, receive_addr, 0);

        return
                carDao.setTransport(car_id) > 0 &&
                        logDao.logTranspot(car_id, send_addr, receive_addr, cost, employee_id) > 0;

    }


}
