package com.example.howtodoinjava.springeurekaclientschoolservice.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="student-service",url="http://localhost:8098")
public interface myFeignClient {

        @GetMapping("/getStudentDetailsForSchool/{schoolname}")
        String studentService(@PathVariable String schoolname);
}
