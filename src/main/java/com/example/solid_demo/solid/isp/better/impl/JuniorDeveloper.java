package com.example.solid_demo.solid.isp.better.impl;

import com.example.solid_demo.solid.isp.better.Eater;
import com.example.solid_demo.solid.isp.better.MeetingAttendee;
import com.example.solid_demo.solid.isp.better.Programmer;
import com.example.solid_demo.solid.isp.better.Sleeper;
import com.example.solid_demo.solid.isp.better.Worker;

/**
 * @author udayhegde
 */
// Junior developer implements basic interfaces
public class JuniorDeveloper implements Worker, Eater, Sleeper, Programmer, MeetingAttendee {
    
    @Override
    public void work() {
        System.out.println("Junior developer working hard...");
    }
    
    @Override
    public void eat() {
        System.out.println("Taking lunch break...");
    }
    
    @Override
    public void sleep() {
        System.out.println("Getting rest for tomorrow...");
    }
    
    @Override
    public void program() {
        System.out.println("Writing code with supervision...");
    }
    
    @Override
    public void testCode() {
        System.out.println("Running unit tests...");
    }
    
    @Override
    public void attendMeetings() {
        System.out.println("Learning in meetings...");
    }
    // Notice: No deployApplication() - junior can't deploy
}