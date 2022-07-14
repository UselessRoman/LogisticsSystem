package com.wjc.service;

import com.wjc.domain.Car;

import java.util.List;

public interface CarService {
    /**
     * 根据id查询车辆
     *
     * @param id
     * @return com.wjc.domain.Car
     * @create 2022/7/13 15:46
     */
    Car getByID(int id);

    /**
     * 查询空闲车辆
     *
     * @return java.util.List<com.wjc.domain.Car>
     * @create 2022/7/13 15:45
     */
    List<Car> getAvailable();

    //TODO 安排货物的具体算法怎么实现
    /**
     * 把未装车的货物装车
     *
     * @return void
     * @create 2022/7/14 9:38
     */
    void loadPackages();

    /**
     * 把car的状态从'空闲'设置为'需要维修'
     *
     * @return boolean
     * @create 2022/7/14 10:03
     */
    boolean setRepair(int id);


    /**
     * 把car的状态从'需要维修'设置为'空闲'
     *
     * @return boolean
     * @create 2022/7/14 10:03
     */
    boolean doRepair(int id);
}
