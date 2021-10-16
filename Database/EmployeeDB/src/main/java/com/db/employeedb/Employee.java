package com.db.employeedb;
import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name="Employee")
@Table(name = "Employees")
public class Employee {



    @Id
//    @SequenceGenerator(
//            name="employee_sequence",
//            sequenceName = "employee_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = SEQUENCE,
//            generator = "employee_sequence"
//    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "id",
            updatable = false,
            nullable = false
    )
    private int id;

    @ManyToOne()
    @JoinColumn(name="role_id")
    private Roles role;



    @ManyToMany(mappedBy = "enrolledEmployees")
    private Set<Proj> projects = new HashSet<>();

    @Column(
            nullable = false,
            name = "name",
            columnDefinition = "TEXT"
    )
    private String name;

    @Column(
            nullable = false,
            name = "email",
            columnDefinition = "TEXT",
            unique=true
    )
    private String email;

    @Column(
            nullable = false,
            name = "mobile",
            columnDefinition = "NUMBER"
    )
    private int mobile;

    @Column(name="age", nullable = false)
    private int age;

    @Column(
            name="natId",
            nullable = false
    )
    private Long natId;

    public Employee(String name, String email, int mobile, int age, Long natId) {
        this.id=id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.age = age;
        this.natId = natId;
    }
    public Employee() {
        this.id=0;
        this.name = "";
        this.email = "";
        this.mobile = 0;
        this.age = 0;
        this.natId = 0L;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getNatId() {
        return natId;
    }

    public void setNatId(Long natId) {
        this.natId = natId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public Set<Proj> getProjects() {
        return projects;
    }

    public void setProjects(Set<Proj> projects) {
        this.projects = projects;
    }
}
