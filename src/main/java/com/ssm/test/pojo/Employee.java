package com.ssm.test.pojo;

public class Employee {
    private String employeeid;

    private String employeename;

    private Integer employeeold;

    private String employeesex;

    private String employeeaddress;

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid == null ? null : employeeid.trim();
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename == null ? null : employeename.trim();
    }

    public Integer getEmployeeold() {
        return employeeold;
    }

    public void setEmployeeold(Integer employeeold) {
        this.employeeold = employeeold;
    }

    public String getEmployeesex() {
        return employeesex;
    }

    public void setEmployeesex(String employeesex) {
        this.employeesex = employeesex == null ? null : employeesex.trim();
    }

    public String getEmployeeaddress() {
        return employeeaddress;
    }

    public void setEmployeeaddress(String employeeaddress) {
        this.employeeaddress = employeeaddress == null ? null : employeeaddress.trim();
    }
}