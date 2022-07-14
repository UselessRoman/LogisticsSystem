package com.wjc.dao;

import com.wjc.domain.Package;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PackageDao {

    @Select("select * from package where sender_id =#{id} ;")
    List<Package> getBySenderId(int id);

    @Select("select * from package where receiver_id =#{id} ;")
    List<Package> getByReceiverId(int id);


    // TODO package_id自增的问题
    @Insert("insert into package(send_addr, receive_addr, car_id, sender_id, receiver_id, weight, price) " +
            "values(#{send_addr}, #{receive_addr}, #{car_id}, #{sender_id}, #{receiver_id}, #{weight},#{price})")
    int addPackage(Package p);


    @Select("select * from package where car_id is NULL")
    List<Package> getNeededToSend();
}
