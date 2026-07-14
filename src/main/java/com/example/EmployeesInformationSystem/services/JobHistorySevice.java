package com.example.EmployeesInformationSystem.services;

import java.time.LocalDate;
import java.util.List;

import com.example.EmployeesInformationSystem.dto.JobHistoryRequestDTO;
import com.example.EmployeesInformationSystem.entity.JobHistory;


public interface JobHistorySevice {

    List<JobHistory> EmployeeJobHistory(Integer a);
    void SaveEmpHistory(JobHistoryRequestDTO j);
}
