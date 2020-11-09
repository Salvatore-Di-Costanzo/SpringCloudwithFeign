package com.example.servicemain.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient (name = "meteo-service" , url = "api.openweathermap.org/data/2.5/")
public interface ServiceMeteo {

    @GetMapping("/weather?q={nomeCitta}&appid=9935c024f07bdcf57a8c51a7c46ff056")
    public String getMeteo(@PathVariable String nomeCitta);


}
