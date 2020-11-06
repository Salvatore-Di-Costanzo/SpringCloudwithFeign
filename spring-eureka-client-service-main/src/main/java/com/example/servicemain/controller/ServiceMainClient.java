package com.example.servicemain.controller;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/// Nome del client , url di base
@FeignClient (name="ServiceMain",url = "http://localhost:9098")
public interface ServiceMainClient {

    /// url dove posso effettuare la chiamata
    @GetMapping("/getSchoolDetails/{schoolname}")
    public String getSchool(@PathVariable String schoolname);

    @GetMapping("/getInfo/{schoolname}")
    public String getInfo(@PathVariable String schoolname);

}
