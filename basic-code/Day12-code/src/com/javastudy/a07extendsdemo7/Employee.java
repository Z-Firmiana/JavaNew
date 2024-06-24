package com.javastudy.a07extendsdemo7;

public class Employee {
    private String id;
    private String name;
    private String workCon;

    public Employee() {
    }

    public Employee(String id, String name, String workCon) {
        this.id = id;
        this.name = name;
        this.workCon = workCon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkCon() {
        return workCon;
    }

    public void setWorkCon(String workCon) {
        this.workCon = workCon;
    }

    public void work() {
        System.out.println("员工在工作");
    }
}
