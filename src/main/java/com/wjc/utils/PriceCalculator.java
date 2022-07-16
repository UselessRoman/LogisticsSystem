package com.wjc.utils;

import java.util.HashMap;

public class PriceCalculator {

    /**
     * 根据出发地、目的地和重量计算包裹费用
     *
     * @param sendAddr
     * @param receiveAddr
     * @param weight
     * @return int
     * @create 2022/7/15 11:24
     */
    public static int calculate(String sendAddr, String receiveAddr, int weight) {
        HashMap<String, HashMap<String, Integer>> distanceMap = new HashMap<>();
        HashMap<String, Integer> CDDistance = new HashMap<>();
        CDDistance.put("重庆", 1);
        CDDistance.put("北京", 5);
        CDDistance.put("上海", 4);
        distanceMap.put("成都", CDDistance);
        HashMap<String, Integer> CQDistance = new HashMap<>();
        CDDistance.put("成都", 1);
        CDDistance.put("北京", 4);
        CDDistance.put("上海", 3);
        distanceMap.put("重庆", CQDistance);
        HashMap<String, Integer> BJDistance = new HashMap<>();
        CDDistance.put("成都", 5);
        CDDistance.put("重庆", 4);
        CDDistance.put("上海", 3);
        distanceMap.put("北京", BJDistance);
        HashMap<String, Integer> SHDistance = new HashMap<>();
        CDDistance.put("成都", 4);
        CDDistance.put("北京", 3);
        CDDistance.put("重庆", 3);
        distanceMap.put("上海", SHDistance);

        if (weight==0) weight=50;
        return distanceMap.get(sendAddr).get(receiveAddr) * weight;
    }
}
