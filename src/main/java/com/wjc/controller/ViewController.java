package com.wjc.controller;


import com.wjc.domain.Package;
import com.wjc.service.CustomerService;
import com.wjc.service.EmployeeService;
import com.wjc.service.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ViewController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private PackageService packageService;

    @Autowired
    private CustomerService customerService;

    @GetMapping("/packages.html")
    public String toPage() {
        return "packages";
    }

    @GetMapping("/index.html")
    public String toIndex() {
        return "index";
    }

    @GetMapping("/pricing.html")
    public String toPrice() {
        return "pricing";
    }

    @GetMapping("/caontact.html")
    public String toContact() {
        return "caontact";
    }

    @GetMapping("/login.html")
    public String login() {
        return "login";
    }

    @GetMapping("/manager.html/{employee_id}")
    public String manager(@PathVariable int employee_id) {

        return "manager";
    }

    @GetMapping("/about.html")
    public String about() {
        return "about";
    }

    @GetMapping("/contact.html")
    public String contact() {
        return "contact";
    }


    @GetMapping("/driver.html/{employee_id}")
    public String driver(@PathVariable int employee_id) {
        return "driver";
    }


    @GetMapping("/repair.html/{employee_id}")
    public String repair(@PathVariable int employee_id) {
        return "repair";
    }

    @RequestMapping(value = "/employee_login")
    public void test(HttpServletResponse httpServletResponse, HttpServletRequest httpServletRequest) throws IOException {

        int employee_id = Integer.parseInt(httpServletRequest.getParameter("employee_id"));
        String password = httpServletRequest.getParameter("password");

        if (employeeService.verifyLogin(employee_id, password)) {

            // create a cookie
            Cookie cookie = new Cookie("employee_id", Integer.toString(employee_id));

            //add cookie to response
            httpServletResponse.addCookie(cookie);

            switch (employeeService.getDept(employee_id)) {
                case "经理": {
                    httpServletResponse.sendRedirect("manager.html/" + employee_id);
                    break;
                }
                case "司机": {
                    httpServletResponse.sendRedirect("driver.html/" + employee_id);
                    break;
                }
                case "维修工": {
                    httpServletResponse.sendRedirect("repair.html/" + employee_id);
                    break;
                }
            }

        } else {
            System.out.println("wrong");
            httpServletResponse.sendRedirect("index.html");
        }
    }

    @RequestMapping("/addPackage")
    public void addPackage(HttpServletResponse httpServletResponse, HttpServletRequest httpServletRequest) throws
            IOException {
        Package p = new Package();
        int sender_id = customerService.getCustomerIdByTel(httpServletRequest.getParameter("sender_tel"));
        int receiver_id = customerService.getCustomerIdByTel(httpServletRequest.getParameter("receiver_tel"));
        String sender_addr = httpServletRequest.getParameter("sender_addr");
        String receiver_addr = httpServletRequest.getParameter("receiver_addr");
        int weight = Integer.parseInt(httpServletRequest.getParameter("weight"));
        p.setWeight(weight);
        p.setReceive_addr(receiver_addr);
        p.setSend_addr(sender_addr);
        p.setReceiver_id(receiver_id);
        p.setSender_id(sender_id);
        System.out.println(p);
        packageService.addPackage(p);
        httpServletResponse.sendRedirect("packages.html");
    }


}
