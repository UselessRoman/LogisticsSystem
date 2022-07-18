package com.wjc.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CustomerDao {
    @Select("select customer_id from customer where customer_tel=#{tel}")
    int getCustomerIdByTel(String tel);
}
