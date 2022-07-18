package com.wjc.service;


import com.wjc.utils.PriceCalculator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PriceCalculatorTest
{
    @Test
    public void test1()
    {
        System.out.println(PriceCalculator.calculate("成都","上海",50));
    }
}
