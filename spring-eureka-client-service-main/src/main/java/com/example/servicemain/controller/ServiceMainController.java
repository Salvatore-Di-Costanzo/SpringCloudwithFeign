package com.example.servicemain.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableFeignClients
public class ServiceMainController {

    @Autowired
    private ServiceMainClient serviceMainController;

    @GetMapping("/findSchool/{name}")
    public String getSchool(@PathVariable String name){
        return serviceMainController.getSchool(name);
    }

    @GetMapping("/getInfo/{name}")
    public String getInfo(@PathVariable String name){
        return serviceMainController.getInfo(name);
    }
}
