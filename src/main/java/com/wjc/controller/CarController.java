package com.wjc.controller;

import com.wjc.domain.Car;
import com.wjc.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {


    @Autowired
    private CarService carService;

    @GetMapping("/{car_id}")
    public Result getByCarId(@PathVariable Integer car_id) {
        Car car = carService.getByID(car_id);
        Integer code = (car != null) ? Code.GET_OK : Code.GET_ERR;
        String msg = (car != null) ? null : "查询失败！";

        return new Result(code, car, msg);
    }

    @GetMapping
    public Result getAvailable() {
        List<Car> cars = carService.getAvailable();
        Integer code = (cars != null) ? Code.GET_OK : Code.GET_ERR;
        String msg = (cars != null) ? null : "查询失败！";

        return new Result(code, cars, msg);
    }

    @PutMapping
    public Result setRepair(@RequestBody int car_id) {
        boolean flag = carService.setRepair(car_id);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

//    @PutMapping
//    public Result doRepair(@RequestBody int car_id) {
//        boolean flag = carService.doRepair(car_id);
//        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
//    }

}
