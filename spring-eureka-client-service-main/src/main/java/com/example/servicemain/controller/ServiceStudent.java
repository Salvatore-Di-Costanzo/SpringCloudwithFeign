package com.example.servicemain.controller;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "service-student" , url = "http://localhost:8098")

public interface ServiceStudent {

    @GetMapping("/getStudentDetailsForSchool/{schoolname}")
    public String getInfoStudenti(@PathVariable String schoolname);

    @GetMapping("/getAllStudents")
    public String getAllStudents();

}
