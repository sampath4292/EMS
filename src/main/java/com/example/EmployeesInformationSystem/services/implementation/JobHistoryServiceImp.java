package com.example.EmployeesInformationSystem.services.implementation;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeesInformationSystem.entity.JobHistory;
import com.example.EmployeesInformationSystem.entity.JobHistoryId;
import com.example.EmployeesInformationSystem.repository.JobHistoryRepo;
import com.example.EmployeesInformationSystem.dto.JobHistoryRequestDTO;
import com.example.EmployeesInformationSystem.services.JobHistorySevice;


@Service
public class JobHistoryServiceImp  implements JobHistorySevice{

    @Autowired
    JobHistoryRepo repo;

    @Override
    public List<JobHistory> EmployeeJobHistory(Integer a) {
        return repo.findByEmployeeEmployeeId(a);
    }
    @Override
    public void SaveEmpHistory(JobHistoryRequestDTO request) {
        

    JobHistory jobHistory = new JobHistory();

    JobHistoryId id = new JobHistoryId();

    id.setEmployeeId(request.getEmployeeId());
    id.setJobId(request.getJobId());

    jobHistory.setId(id);

    jobHistory.setEmployee(employeeId);
    jobHistory.setJob(jobId);

    jobHistory.setStartDate(request.getStartDate());
    jobHistory.setEndDate(request.getEndDate());

    repo.save(jobHistory);
        
    }
    
}
