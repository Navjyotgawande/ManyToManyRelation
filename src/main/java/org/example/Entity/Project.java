package org.example.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Project {
    @Id
    private  int pid;
    @Column(name = "project_name")
    private String projectName;
    @ManyToMany(mappedBy = "projectList")
    private List<Employee> employeeList;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Project(int pid, String projectName, List<Employee> employeeList) {
        this.pid = pid;
        this.projectName = projectName;
        this.employeeList = employeeList;
    }

    public Project() {
        super();
    }
}
