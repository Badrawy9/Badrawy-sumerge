package com.db.employeedb;

import javax.persistence.*;

@Entity
@Table(name ="enrolled_employees")
public class EnrolledEmployees {

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


    @Column
    private int employee_id;

    @Column
    private String proj_name;

    public EnrolledEmployees(int employee_id, String proj_name) {
        this.employee_id = employee_id;
        this.proj_name=proj_name;
    }

    public EnrolledEmployees() {    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getProj_name() {
        return proj_name;
    }

    public void setProj_name(String proj_name) {
        this.proj_name = proj_name;
    }
}
