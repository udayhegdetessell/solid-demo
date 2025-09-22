package com.example.solid_demo.solid.srp.better.service;

/**
 * Service interface for generating user reports
 * @author udayhegde
 */
public interface ReportService {
    
    /**
     * Generates a report for a specific user
     *
     * @param userId the ID of the user to generate the report for
     */
    void generateReport(Long userId);
}
