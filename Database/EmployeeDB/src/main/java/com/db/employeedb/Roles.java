package com.db.employeedb;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Roles {

    @Column
    private String name;

    @OneToMany()
    @JoinColumn(name = "id")
    private Set<Employee> employees;

    public Roles(String name, Set<Employee> employees, int id) {
        this.name = name;
        this.employees = employees;
        this.id = id;
    }

    public Roles() {
    }

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "id",
            updatable = false,
            nullable = false
    )
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
