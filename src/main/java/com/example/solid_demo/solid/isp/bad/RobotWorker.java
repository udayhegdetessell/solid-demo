package com.example.solid_demo.solid.isp.bad;

/**
 * @author udayhegde
 */
// Robot worker forced to implement irrelevant methods
public class RobotWorker implements WorkerOperations {
    
    @Override
    public void work() {
        System.out.println("Robot working...");
    }
    
    @Override
    public void program() {
        System.out.println("Robot programming...");
    }
    
    @Override
    public void testCode() {
        System.out.println("Robot testing code...");
    }
    
    @Override
    public void deployApplication() {
        System.out.println("Robot deploying application...");
    }
    
    // Forced to implement irrelevant methods!
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot doesn't eat!");
    }
    
    @Override
    public void sleep() {
        throw new UnsupportedOperationException("Robot doesn't sleep!");
    }
    
    @Override
    public void attendMeetings() {
        throw new UnsupportedOperationException("Robot doesn't attend meetings!");
    }
    
    @Override
    public void writeDocumentation() {
        throw new UnsupportedOperationException("Robot doesn't write documentation!");
    }
}