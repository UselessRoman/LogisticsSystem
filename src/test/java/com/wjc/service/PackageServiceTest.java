package com.wjc.service;

import com.wjc.domain.Package;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PackageServiceTest {
    @Autowired
    PackageService packageService;

    @Test
    void TestGetBySenderID() {
        System.out.println(packageService.getBySenderId(201));
    }


    @Test
    void TestGetByReceiverID() {
        System.out.println(packageService.getByReceiverId(202));
    }


    @Test
    void TestAddPackage() {
        Package p = new Package();
        p.setSend_addr("AAA");
        p.setReceive_addr("BBB");
        p.setSender_id(1);
        p.setReceiver_id(2);
        p.setPrice(50);
        p.setWeight(20);
        p.setCar_id(3);
        if (packageService.addPackage(p))
            System.out.println("yes");
    }

    @Test
    void TestGetByPackageID()
    {
        System.out.println(packageService.getByPackageId(401));
    }


}
