package com.wjc.dao;

import com.wjc.domain.Car;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface CarDao {

    @Select("select * from car where car_id=#{id}")
    Car getByID(int id);

    @Select("select * from car where state = '空闲' ")
    List<Car> getAvailable();

    @Update("update car set state='需要维修' where car_id=#{car_id} and state='空闲'")
    int setRepair(int car_id);

    @Update("update car set state='空闲' where car_id=#{car_id} and state ='需要维修'")
    int doRepair(int car_id);

    @Update("update car set state='运输中' where car_id=#{car_id} and state ='空闲'")
    int setTransport(int car_id);
}
