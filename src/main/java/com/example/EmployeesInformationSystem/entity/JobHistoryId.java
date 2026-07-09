package com.example.EmployeesInformationSystem.entity;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class JobHistoryId implements Serializable {

    private Integer employeeId;
    private Integer jobId;

    public JobHistoryId() {
    }

    public JobHistoryId(Integer employeeId, Integer jobId) {
        this.employeeId = employeeId;
        this.jobId = jobId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobHistoryId)) return false;

        JobHistoryId that = (JobHistoryId) o;

        return Objects.equals(employeeId, that.employeeId)
                && Objects.equals(jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, jobId);
    }
}