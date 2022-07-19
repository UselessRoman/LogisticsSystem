package com.wjc.controller;

import com.wjc.domain.Car;
import com.wjc.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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

    @PostMapping("/addRepair")
    public Result addRepair(@RequestBody Map<String,Object> map) {
        boolean flag = carService.addRepair(map);
        return new Result(flag ? Code.ADD_OK : Code.ADD_ERR, flag);
    }

    @PutMapping("/doRepair/{car_id}/{employee_id}")
    public Result doRepair(@PathVariable int car_id, @PathVariable int employee_id) {
        boolean flag = carService.doRepair(car_id, employee_id);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @GetMapping("/getRepair")
    public Result getRepair() {
        List<Map<String, Object>> cars = carService.getRepair();
        Integer code = (cars != null) ? Code.GET_OK : Code.GET_ERR;
        String msg = (cars != null) ? null : "查询失败";
        return new Result(code, cars, msg);
    }

    @PutMapping("/doTransport/{car_id}/{send_addr}/{receive_addr}/{employee_id}")
    public Result doTransport(@PathVariable int car_id,@PathVariable String send_addr,@PathVariable String receive_addr,@PathVariable int employee_id) {
        boolean flag = carService.doTransport(car_id,send_addr,receive_addr,employee_id);
        Integer code = (flag) ? Code.UPDATE_OK : Code.UPDATE_ERR;
        String msg = (flag) ? null : "查询失败";
        return new Result(code, flag, msg);
    }

}
