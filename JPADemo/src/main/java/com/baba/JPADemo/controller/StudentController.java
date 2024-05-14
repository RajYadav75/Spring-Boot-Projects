package com.baba.JPADemo.controller;

import com.baba.JPADemo.entity.Student;
import com.baba.JPADemo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/std")
public class StudentController {
    @Autowired
    StudentRepo studentRepo;

    @GetMapping("/save")
    public void saveStudent()
    {
        Student student =
                new Student();
        student.setId(1);
        student.setName("Raj");
        student.setCourse("Java");
        student.setAddress("Kanapar,Bansgoan,Gorakhpur");
        studentRepo.save(student);
    }
}
