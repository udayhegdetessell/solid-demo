package com.example.solid_demo.solid.isp.better.impl;

import com.example.solid_demo.solid.isp.better.Deployer;
import com.example.solid_demo.solid.isp.better.Programmer;
import com.example.solid_demo.solid.isp.better.Worker;
import lombok.extern.slf4j.Slf4j;

/**
 * @author udayhegde
 */
// Robot implements only relevant interfaces
  @Slf4j
public class RobotWorker implements Worker, Programmer, Deployer {
    
    @Override
    public void work() {
        log.info("Robot working 24/7...");
    }
    
    @Override
    public void program() {
        log.info("Robot writing perfect code...");
    }
    
    @Override
    public void testCode() {
        log.info("Robot running comprehensive tests...");
    }
    
    @Override
    public void deployApplication() {
        log.info("Robot deploying with zero downtime...");
    }
}