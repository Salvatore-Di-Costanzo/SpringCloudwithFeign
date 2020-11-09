package com.example.servicemain.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableFeignClients
public class ServiceMainController {

    @Autowired
    private ServiceMainClient serviceMainController;
    @Autowired
    private ServiceStudent serviceStudent;
    @Autowired
    private ServiceMeteo serviceMeteo;

    @GetMapping("/findSchool/{name}")
    public String getSchool(@PathVariable String name){
        return serviceMainController.getSchool(name);
    }

    @GetMapping("/getInfo/{name}")
    public String getInfo(@PathVariable String name){
        return serviceMainController.getInfo(name);
    }

    @GetMapping("/studenti/{nomeistituto}")
    public String getStudenti(@PathVariable String nameIstituto){return serviceStudent.getInfoStudenti(nameIstituto);}

    @GetMapping("/listStudents")
    public String getAllStudents(){return serviceStudent.getAllStudents();}

    @GetMapping("/meteo/{citta}")
    public String getMeteoCitta(@PathVariable String citta){ return serviceMeteo.getMeteo(citta);}
}
