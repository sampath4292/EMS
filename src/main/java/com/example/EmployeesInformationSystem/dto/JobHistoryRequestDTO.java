package com.example.EmployeesInformationSystem.dto;

import java.time.LocalDate;

public class JobHistoryRequestDTO {

    private Integer employeeId;
    private Integer jobId;
    private LocalDate startDate;
    private LocalDate endDate;

    public JobHistoryRequestDTO() {
    }

    public JobHistoryRequestDTO(Integer employeeId,Integer jobId,LocalDate startDate,LocalDate endDate) {

        this.employeeId = employeeId;
        this.jobId = jobId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}