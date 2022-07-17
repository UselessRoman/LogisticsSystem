package com.wjc.controller;

import com.wjc.domain.Package;
import com.wjc.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/packages")
public class PackageController {
    @Autowired
    private PackageService packageService;

    @GetMapping("/{package_id}")
    public Result getByPackageId(@PathVariable Integer package_id) {
        List<Package> p = packageService.getByPackageId(package_id);
        Integer code = (p != null) ? Code.GET_OK : Code.GET_ERR;
        String msg = (p != null) ? null : "查询失败！";

        return new Result(code, p, msg);
    }

    @GetMapping
    public Result getAllPackage() {
        System.out.println("all");
        List<Package> p = packageService.getAllPackage();
        Integer code = (p != null) ? Code.GET_OK : Code.GET_ERR;
        String msg = (p != null) ? null : "查询失败！";

        return new Result(code, p, msg);
    }

    @GetMapping("/send/{sender_id}")
    public Result getBySenderId(@PathVariable Integer sender_id) {

        List<Package> packages = packageService.getBySenderId(sender_id);
        Integer code = (packages != null) ? Code.GET_OK : Code.GET_ERR;
        String msg = (packages != null) ? null : "查询失败！";

        return new Result(code, packages, msg);
    }

    @GetMapping("/receive/{receiver_id}")
    public Result getByReceiverId(@PathVariable Integer receiver_id) {
        List<Package> packages = packageService.getByReceiverId(receiver_id);
        Integer code = (packages != null) ? Code.GET_OK : Code.GET_ERR;
        String msg = (packages != null) ? null : "查询失败！";

        return new Result(code, packages, msg);
    }

    @PostMapping
    public Result addPackage(@RequestBody Package p) {
        boolean flag = packageService.addPackage(p);

        return new Result(flag ? Code.ADD_OK : Code.ADD_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Package p) {
        boolean flag = packageService.setArrived(p);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }
}
