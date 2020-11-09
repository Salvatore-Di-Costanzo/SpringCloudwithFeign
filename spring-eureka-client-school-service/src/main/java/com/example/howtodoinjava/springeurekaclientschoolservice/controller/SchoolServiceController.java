package com.example.howtodoinjava.springeurekaclientschoolservice.controller;



import jdk.incubator.jpackage.internal.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableFeignClients
@Slf4j
public class SchoolServiceController {

    @Autowired
    private MyFeignClient myFeignClient;

    @GetMapping("/getSchoolDetails/{schoolname}")
    public String getStudents(@PathVariable String schoolname) {
        Log.info("Getting School details for " + schoolname);
        String response = myFeignClient.studentService(schoolname);

       Log.info("Response Received as " + response);

        return "School Name -  " + schoolname + " \n Student Details " + response;
    }

    @GetMapping("/info/{school}")
    public String getInfo(@PathVariable String school){
        return "The name of School is : " + school;

    }


}
