package com.example.solid_demo.solid.isp.bad;

/**
 * @author udayhegde
 */
// Fat interface - violates ISP
public interface WorkerOperations {
    void work();
    void eat();
    void sleep();
    void program();
    void attendMeetings();
    void writeDocumentation();
    void testCode();
    void deployApplication();
}