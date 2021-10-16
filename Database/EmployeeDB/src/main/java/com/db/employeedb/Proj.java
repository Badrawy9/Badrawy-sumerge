package com.db.employeedb;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name="Proj")
public class Proj {

    @Id
    @Column(
            nullable = false,
            name = "name",
            columnDefinition = "TEXT"
    )
    private String name;

    @ManyToMany
    @JoinTable(
            name = "enrolled_employees",
            joinColumns = @JoinColumn(name = "proj_name"),
            inverseJoinColumns = @JoinColumn(name = "employee_id")
    )
    private Set<Employee> enrolledEmployees=new HashSet<>();
    @Column(
            name = "date",
            nullable = false
    )
    private int date;

    @Column(
            name = "manager",
            nullable = false
    )
    private String manager;

    public Proj(String name, int date, String manager) {
        this.name = name;
        this.date = date;
        this.manager = manager;
    }
    public Proj() {
        this.name = "";
        this.date = 0;
        this.manager = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
