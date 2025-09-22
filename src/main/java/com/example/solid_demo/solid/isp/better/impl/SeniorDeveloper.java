package com.example.solid_demo.solid.isp.better.impl;

import com.example.solid_demo.solid.isp.better.Deployer;
import com.example.solid_demo.solid.isp.better.DocumentationWriter;
import com.example.solid_demo.solid.isp.better.Eater;
import com.example.solid_demo.solid.isp.better.MeetingAttendee;
import com.example.solid_demo.solid.isp.better.Programmer;
import com.example.solid_demo.solid.isp.better.Sleeper;
import com.example.solid_demo.solid.isp.better.Worker;
import lombok.extern.slf4j.Slf4j;

/**
 * @author udayhegde
 */
// Senior developer implements all relevant interfaces
  @Slf4j
public class SeniorDeveloper implements Worker, Eater, Sleeper, Programmer,
    Deployer, MeetingAttendee, DocumentationWriter {
    
    @Override
    public void work() {
        log.info("Senior developer architecting solutions...");
    }
    
    @Override
    public void eat() {
        log.info("Quick coffee break...");
    }
    
    @Override
    public void sleep() {
        log.info("Rest after code review...");
    }
    
    @Override
    public void program() {
        log.info("Writing scalable, maintainable code...");
    }
    
    @Override
    public void testCode() {
        log.info("Writing comprehensive test suites...");
    }
    
    @Override
    public void deployApplication() {
        log.info("Deploying with proper CI/CD pipeline...");
    }
    
    @Override
    public void attendMeetings() {
        log.info("Leading technical discussions...");
    }
    
    @Override
    public void writeDocumentation() {
        log.info("Creating technical documentation...");
    }
}