package com.wjc.dao;

import com.wjc.domain.Package;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface PackageDao {

    @Select("select * from package where sender_id =#{id} ;")
    List<Package> getBySenderId(int id);

    @Select("select * from package where receiver_id =#{id} ;")
    List<Package> getByReceiverId(int id);

    @Select("select * from package where package_id=#{id}")
    List<Package> getByPackageId(int id);


    @Insert("insert into package(send_addr, receive_addr, car_id, sender_id, receiver_id, weight, price) " +
            "values(#{send_addr}, #{receive_addr}, #{car_id}, #{sender_id}, #{receiver_id}, #{weight},#{price})")
    int addPackage(Package p);


    @Select("select * from package where car_id is NULL and send_addr=#{send_addr} and receive_addr=#{receive_addr} ")
    List<Package> getNeededToSend(String send_addr, String receive_addr);

    @Update("update package set car_id=#{car_id} where package_id=#{package_id}  ")
    int updateCarId(Package p);

    @Update("update package set status ='到达' where package_id=#{package_id}  ")
    int setArrived(int package_id);


    @Select("select * from package")
    List<Package> getAllPackage();
}