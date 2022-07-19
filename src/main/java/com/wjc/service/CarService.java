package com.wjc.service;

import com.wjc.domain.Car;

import java.util.List;
import java.util.Map;

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
    boolean addRepair(Map<String,Object> map);


    /**
     * 把car的状态从'需要维修'设置为'空闲'
     *
     * @return boolean
     * @create 2022/7/14 10:03
     */
    boolean doRepair(int car_id,int employee_id);


    /**
     * 查询需要维修的车辆
     * @return   List<Map<String, Object>> getRepair();
     * @create 2022/7/18 21:05
     */
    List<Map<String, Object>> getRepair();

    /**
     * 把车辆状态由空闲中设置为运输中
     * @param car_id,send_addr,receive_addr,employee_id
     * @return int
     * @create 2022/7/19 9:06
     */
    boolean doTransport(int car_id,String send_addr,String receive_addr,int employee_id);
}
