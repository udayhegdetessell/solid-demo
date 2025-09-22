package com.example.solid_demo.solid.isp.better.impl;

import com.example.solid_demo.solid.isp.better.Deployer;
import com.example.solid_demo.solid.isp.better.DocumentationWriter;
import com.example.solid_demo.solid.isp.better.Eater;
import com.example.solid_demo.solid.isp.better.MeetingAttendee;
import com.example.solid_demo.solid.isp.better.Programmer;
import com.example.solid_demo.solid.isp.better.Sleeper;
import com.example.solid_demo.solid.isp.better.Worker;

/**
 * @author udayhegde
 */
// Senior developer implements all relevant interfaces
public class SeniorDeveloper implements Worker, Eater, Sleeper, Programmer,
    Deployer, MeetingAttendee, DocumentationWriter {
    
    @Override
    public void work() {
        System.out.println("Senior developer architecting solutions...");
    }
    
    @Override
    public void eat() {
        System.out.println("Quick coffee break...");
    }
    
    @Override
    public void sleep() {
        System.out.println("Rest after code review...");
    }
    
    @Override
    public void program() {
        System.out.println("Writing scalable, maintainable code...");
    }
    
    @Override
    public void testCode() {
        System.out.println("Writing comprehensive test suites...");
    }
    
    @Override
    public void deployApplication() {
        System.out.println("Deploying with proper CI/CD pipeline...");
    }
    
    @Override
    public void attendMeetings() {
        System.out.println("Leading technical discussions...");
    }
    
    @Override
    public void writeDocumentation() {
        System.out.println("Creating technical documentation...");
    }
}