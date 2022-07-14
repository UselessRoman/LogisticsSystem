package com.wjc.service;

import com.wjc.domain.Package;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PackageService
{
    /**
     * 根据寄件人id查询包裹
     * @param id
     * @return List<Package>
     * @create 2022/7/14 9:02
     */
    List<Package> getBySenderId(int id);


    /**
     * 根据收件人id查询包裹
     * @param id
     * @return List<Package>
     * @create 2022/7/14 9:03
     */
    List<Package> getByReceiverId(int id);


    // TODO 计算包裹的费用
    /**
     * 添加一个包裹
     * @param p 
     * @return boolean 
     * @create 2022/7/14 9:10
     */
    boolean addPackage(Package p);
}
