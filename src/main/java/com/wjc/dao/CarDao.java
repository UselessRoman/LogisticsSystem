package com.wjc.dao;

import com.wjc.domain.Car;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CarDao {

    @Select("select * from car where car_id=#{id}")
    Car getByID(int id);


    @Select("select * from car where state = '空闲' ")
    List<Car> getAvailable();
}
