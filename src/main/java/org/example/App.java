package org.example;

import org.example.Entity.Employee;
import org.example.Entity.Project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {

//        System.out.println( "Hello World!" );
        try{
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            SessionFactory sessionFactory = cfg.buildSessionFactory();
            Session session =sessionFactory.openSession();
            Transaction t =session.beginTransaction();

            Employee emp1 = new Employee();
            emp1.setEmpId(37);
            emp1.setName("Akshay");

            Employee emp2 = new Employee();
            emp2.setEmpId(38);
            emp2.setName("Sagar");


            Project p1 = new Project();
            p1.setPid(12345);
            p1.setProjectName("chatnbot");



            Project p2 = new Project();
            p2.setPid(45343);
            p2.setProjectName("Machine learning");

            List<Employee> employeeList =  new ArrayList<>();
            employeeList.add(emp1);
            employeeList.add(emp2);
            List<Project> projectList = new ArrayList<>();
            projectList.add(p1);
            projectList.add(p2);


            emp1.setProjectList(projectList);

            p2.setEmployeeList(employeeList);

            session.save(emp1);
            session.save(emp2);
            session.save(p1);
            session.save(p2);
           t.commit();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
