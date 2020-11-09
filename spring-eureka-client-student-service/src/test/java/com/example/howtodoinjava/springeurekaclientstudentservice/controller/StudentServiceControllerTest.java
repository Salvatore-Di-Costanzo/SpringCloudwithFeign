package com.example.howtodoinjava.springeurekaclientstudentservice.controller;

import com.example.howtodoinjava.springeurekaclientstudentservice.domain.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class StudentServiceControllerTest {

    @Mock
    List<Student> student;
    @Mock
    StudentServiceController studentServiceController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getStudents() {

        Mockito.when(studentServiceController.getStudents("schooltest")).thenReturn(student);

        List<Student> result = studentServiceController.getStudents("schooltest");

        Assert.assertEquals(result, student);

    }

    @Test
    public void getAllStudents() {

        when(studentServiceController.getAllStudents()).thenReturn("result");

        final String result = studentServiceController.getAllStudents();

        assertEquals("result", result);


    }
}