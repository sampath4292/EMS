package com.example.EmployeesInformationSystem.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="department")
public class Department {
    
    @Id
    @Column(name = "department_id")
    private Integer department_id;

    @Column(name = "department_name")
    private String department_name;

    @OneToMany(mappedBy="department")
    List <Employee>employees;

    @OneToOne
    @JoinColumn(name = "hod_employee_id")
    private Employee hod;
    

    public Department(Integer department_id, String department_name) {
        this.department_id = department_id;
        this.department_name = department_name;
    }

    public Department(){}

    public Integer getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    @Override
    public String toString() {
        return "Department [department_id=" + department_id + ", department_name=" + department_name + ", toString()="
                + super.toString() + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((department_id == null) ? 0 : department_id.hashCode());
        result = prime * result + ((department_name == null) ? 0 : department_name.hashCode());
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
        Department other = (Department) obj;
        if (department_id == null) {
            if (other.department_id != null)
                return false;
        } else if (!department_id.equals(other.department_id))
            return false;
        if (department_name == null) {
            if (other.department_name != null)
                return false;
        } else if (!department_name.equals(other.department_name))
            return false;
        return true;
    }

    

}
