package com.wjc.dao;

import org.apache.ibatis.annotations.Insert;

public interface LogDao
{
    @Insert("insert into transport_log (car_id,send_addr,receive_addr,cost,employee_id)" +
            " values(#{car_id},#{send_addr},#{receive_addr},#{cost},#{employee_id}) ")
    int insertTransportLog(int car_id,String send_addr,String receive_addr,int cost,int employee_id);

    @Insert("insert into repair_log (car_id,employee_id,cost,description)" +
            " values(#{car_id},#{employee_id},#{cost},#{description}) ")
    int insertRepairLog(int car_id,int employee_id,int cost,String description);
}
