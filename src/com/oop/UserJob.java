package com.oop;

public class UserJob {
    public String company;
    public String department;

    public UserJob () {
    }

    public UserJob (String company, String department) {
        this.company = company;
        this.department = department;
    }

    public void setCompany (String company) {
        this.company = company;
    }

    public String getCompany () {
        return company;
    }

    public void setDepartment (String department) {
        this.department = department;
    }

    public String getDepartment () {
        return department;
    }
}
