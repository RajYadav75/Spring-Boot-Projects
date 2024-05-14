package com.baba.JPADemo.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "students")
public class Student {
    @Id
    @Column(name = "stId")
    Integer id;

    @Id
    @Column(name = "stName")
    String name;

    @Id
    @Column(name = "stCourse")
    String course;

    @Id
    @Column(name = "stAddress")
    String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
