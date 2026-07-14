package com.example.EmployeesInformationSystem.dto;

public class SalaryUpdateRequestDTO
{
    private Integer salary;

    public SalaryUpdateRequestDTO(Integer salary) {
        this.salary = salary;
    }
    public SalaryUpdateRequestDTO(){}
        public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}