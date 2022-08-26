package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    private int eid;
    private String ename;
    @Autowired
    private Department department;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public  void showDetails()
    {
        System.out.println(" Emp Id " + eid);
        System.out.println("Emp Name"+ename);
        department.setDeptName("Information Tech");
        System.out.println("Department "+department.getDeptName());
    }
}
