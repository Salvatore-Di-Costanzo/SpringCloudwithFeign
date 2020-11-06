package com.example.howtodoinjava.springeurekaclientschoolservice.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;


@RestController
@EnableFeignClients
public class SchoolServiceController {

    @Autowired
    private myFeignClient myFeignClient;

    @GetMapping("/getSchoolDetails/{schoolname}")
    public String getStudents(@PathVariable String schoolname) {
        System.out.println("Getting School details for " + schoolname);
        String response = myFeignClient.studentService(schoolname);

        System.out.println("Response Received as " + response);

        return "School Name -  " + schoolname + " \n Student Details " + response;
    }

    @GetMapping("/info/{school}")
    public String getInfo(@PathVariable String school){
        return "The name of School is : " + school;

    }


}
