package com.example.howtodoinjava.springeurekaclientschoolservice.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class SchoolServiceControllerTest {

    @Mock
    MyFeignClient myFeignClient;
    @InjectMocks
    SchoolServiceController schoolServiceController;
    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void getStudents() {
        Mockito.when(myFeignClient.studentService("test")).thenReturn("result");

        String result = schoolServiceController.getStudents("test");

        Assert.assertEquals("School Name -  test"
                + " \n Student Details result" ,result);
    }

    @Test
    public void getInfo() {

        String result = schoolServiceController.getInfo("test");

        Assert.assertEquals("The name of School is : test" , result);
    }
}