package com.example.solid_demo.solid.isp.better.impl;

import com.example.solid_demo.solid.isp.better.Deployer;
import com.example.solid_demo.solid.isp.better.MeetingAttendee;
import com.example.solid_demo.solid.isp.better.Worker;
import java.util.List;
import org.springframework.stereotype.Service;


/**
 * @author udayhegde
 */
// Services can depend on specific interfaces they need
@Service
public class WorkManager {
    
    public void manageWork(List<Worker> workers) {
        workers.forEach(Worker::work); // Only depends on Worker interface
    }
    
    public void scheduleDeployment(List<Deployer> deployers) {
        deployers.forEach(Deployer::deployApplication); // Only needs Deployer
    }
    
    public void organizeMeeting(List<MeetingAttendee> attendees) {
        attendees.forEach(MeetingAttendee::attendMeetings); // Only needs MeetingAttendee
    }
}