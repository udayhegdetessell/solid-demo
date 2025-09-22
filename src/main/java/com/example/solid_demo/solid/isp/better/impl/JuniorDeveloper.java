package com.example.solid_demo.solid.isp.better.impl;

import com.example.solid_demo.solid.isp.better.Eater;
import com.example.solid_demo.solid.isp.better.MeetingAttendee;
import com.example.solid_demo.solid.isp.better.Programmer;
import com.example.solid_demo.solid.isp.better.Sleeper;
import com.example.solid_demo.solid.isp.better.Worker;
import lombok.extern.slf4j.Slf4j;

/**
 * @author udayhegde
 */
// Junior developer implements basic interfaces
  @Slf4j
public class JuniorDeveloper implements Worker, Eater, Sleeper, Programmer, MeetingAttendee {
    
    @Override
    public void work() {
        log.info("Junior developer working.....");
    }
    
    @Override
    public void eat() {
        log.info("Taking lunch break...");
    }
    
    @Override
    public void sleep() {
        log.info("Getting rest for tomorrow...");
    }
    
    @Override
    public void program() {
        log.info("Writing code with supervision...");
    }
    
    @Override
    public void testCode() {
        log.info("Running unit tests...");
    }
    
    @Override
    public void attendMeetings() {
        log.info("Learning in meetings...");
    }
}