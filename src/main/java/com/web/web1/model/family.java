package com.web.web1.model;

import javax.persistence.*;

@Entity
@Table(name = "fahm_tbl")
public class family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false,length = 15)
    private String firstname;

    @Column(length = 15)
    private String othername;

    @Column(nullable = false,length = 4)
    private int yob;

    @Column(nullable = false,length = 20)
    private String email;

    @Column(nullable = false,length = 45)
    private int block;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }
}
