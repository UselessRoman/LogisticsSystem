package com.wjc.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarServiceTest
{
    @Autowired
    private CarService carService;

    @Test
    void testGetByID()
    {
        System.out.println( carService.getByID(101));
    }

    @Test
    void testGetAvailable()
    {
        System.out.println( carService.getAvailable());
    }
}
