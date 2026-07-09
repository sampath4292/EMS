package com.example.EmployeesInformationSystem.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="job")
public class Job {
    @Id
    @Column(name = "job_id")
    private Integer job_id;
    @Column(name = "job_title")
    private String job_title;

    @OneToMany(mappedBy = "job")
    List<Employee>employees;

    public Job(Integer job_id, String job_title) {
    this.job_id = job_id;
    this.job_title = job_title;
    }

    public Job(){}

    public Integer getJob_id() {
        return job_id;
    }
    public void setJob_id(Integer job_id) {
        this.job_id = job_id;
    }
    public String getJob_title() {
        return job_title;
    }
    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    @Override
    public String toString() {
        return "Job [job_id=" + job_id + ", job_title=" + job_title + ", hashCode()=" + hashCode() + ", toString()="
                + super.toString() + "]";
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((job_id == null) ? 0 : job_id.hashCode());
        result = prime * result + ((job_title == null) ? 0 : job_title.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Job other = (Job) obj;
        if (job_id == null) {
            if (other.job_id != null)
                return false;
        } else if (!job_id.equals(other.job_id))
            return false;
        if (job_title == null) {
            if (other.job_title != null)
                return false;
        } else if (!job_title.equals(other.job_title))
            return false;
        return true;
    }
    
}
