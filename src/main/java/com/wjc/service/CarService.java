package com.wjc.service;

import com.wjc.domain.Car;

import java.util.List;

public interface CarService
{
    /**
     * 根据id查询车辆
     * @param id
     * @return com.wjc.domain.Car
     * @create 2022/7/13 15:46
     */
    Car getByID(int id);

    /**
     * 查询空闲车辆
     * @return java.util.List<com.wjc.domain.Car>
     * @create 2022/7/13 15:45
     */
    List<Car> getAvailable();
}
