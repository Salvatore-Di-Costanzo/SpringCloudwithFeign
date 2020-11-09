package com.example.servicemain.controller;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class ServiceMainControllerTest {

    @Mock
    private ServiceMainClient mockServiceMainClient;
    @Mock
    private ServiceStudent mockServiceStudent;
    @Mock
    private ServiceMeteo mockServiceMeteo;

    @InjectMocks
    private ServiceMainController serviceMainControllerUnderTest;

    @Before
    public void setUp() {
        initMocks(this);
    }

    @Test
    public void testGetSchool() {
        // Setup
        when(mockServiceMainClient.getSchool("xyzschool")).thenReturn("result");

        // Run the test
        final String result = serviceMainControllerUnderTest.getSchool("xyzschool");

        // Verify the results
        assertEquals("result", result);
    }

    @Test
    public void testGetInfo() {
        // Setup
        when(mockServiceMainClient.getInfo("schoolname")).thenReturn("result");

        // Run the test
        final String result = serviceMainControllerUnderTest.getInfo("schoolname");

        // Verify the results
        assertEquals("result", result);
    }

    @Test
    public void testGetStudenti() {
        // Setup
        when(mockServiceStudent.getInfoStudenti("schoolname")).thenReturn("result");

        // Run the test
        final String result = serviceMainControllerUnderTest.getStudenti("schoolname");

        // Verify the results
        assertEquals("result", result);
    }

    @Test
    public void testGetAllStudents() {
        // Setup
        when(mockServiceStudent.getAllStudents()).thenReturn("result");

        // Run the test
        final String result = serviceMainControllerUnderTest.getAllStudents();

        // Verify the results
        assertEquals("result", result);
    }

    @Test
    public void testGetMeteoCitta() {
        // Setup
        when(mockServiceMeteo.getMeteo("nomeCitta")).thenReturn("result");

        // Run the test
        final String result = serviceMainControllerUnderTest.getMeteoCitta("nomeCitta");

        // Verify the results
        assertEquals("result", result);
    }
}
