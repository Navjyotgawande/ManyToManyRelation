package org.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Employee {
    @Id
    private int empId;
    private String name;
    @ManyToMany()
    private List<Project> projectList;
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<Project> projectList) {
        this.projectList = projectList;
    }

    public Employee(int empId, String name, List<Project> projectList) {
        this.empId = empId;
        this.name = name;
        this.projectList = projectList;
    }
    public Employee() {
     super();
    }
}
