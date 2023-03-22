package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Data {

    @Id
   @GeneratedValue
    private Integer employeeID; // Primary Key
    //@Column(nullable = false)
    private String employeeName;    // Employee Name
    private boolean employeeParticipation;  // Access Given by Admin ONLY

    // Empty Constructor
    public Data() {
    }

    // Parameters Constructor
    public Data(Integer employeeID, String employeeName, boolean employeeParticipation) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeeParticipation = employeeParticipation;
    }

    // Getters & Setters
    public Integer getEmployeeID() {
        return this.employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID; 
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public boolean isEmployeeParticipation() {
        return this.employeeParticipation;
    }

    public void setEmployeeParticipation(boolean employeeParticipation) {
       this. employeeParticipation = employeeParticipation;
    }
}
