package com.example.solid_demo.solid.isp.better.impl;

import com.example.solid_demo.solid.isp.better.Deployer;
import com.example.solid_demo.solid.isp.better.Programmer;
import com.example.solid_demo.solid.isp.better.Worker;

/**
 * @author udayhegde
 */
// Robot implements only relevant interfaces
public class RobotWorker implements Worker, Programmer, Deployer {
    
    @Override
    public void work() {
        System.out.println("Robot working 24/7...");
    }
    
    @Override
    public void program() {
        System.out.println("Robot writing perfect code...");
    }
    
    @Override
    public void testCode() {
        System.out.println("Robot running comprehensive tests...");
    }
    
    @Override
    public void deployApplication() {
        System.out.println("Robot deploying with zero downtime...");
    }
}