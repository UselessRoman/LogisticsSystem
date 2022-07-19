package com.wjc.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface LogDao {
    @Select("select * from car_repair where status ='需要维修'")
    List<Map<String, Object>> getRepair();

    @Update("update car_repair set status='维修完成', employee_id =#{employee_id} where car_id=#{car_id} and status ='需要维修' ")
    int doRepair(int employee_id, int car_id);

    @Insert("insert into transport_log(car_id, send_addr, receive_addr, cost, employee_id)" +
            " VALUES (#{car_id}, #{send_addr}, #{receive_addr}, #{cost}, #{employee_id}) ")
    int logTranspot(int car_id, String send_addr, String receive_addr, int cost, int employee_id);

    @Insert("insert into car_repair(car_id, cost, description, status) VALUES (#{car_id},#{cost},#{description},'需要维修')")
    int addRepair(int car_id,int cost,String description);
}
