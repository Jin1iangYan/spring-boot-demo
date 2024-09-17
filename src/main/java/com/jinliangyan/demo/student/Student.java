package com.jinliangyan.demo.student;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

// 将这个 Student 类标记为一个实体类，告诉JPA它应该映射到数据库表中。
// 这个注解是JPA中必须的，用来声明一个Java类是数据库表的映射对象。
@Entity
// 指定这个实体类对应的数据库表名称为 students。
// 如果没有这个注解，JPA会默认使用类名作为表名。
// 因此，这个注解明确了表的名称是 students，而不是类名 Student。
@Table(name = "students")
public class Student {
    // 标识该字段为主键。主键是用于唯一标识数据库中每一行数据的字段。
    // 在这里，主键将生成并由JPA进行管理。
    @Id
    // 这个注解用于指定主键生成策略。
    // 这里使用了一个序列生成器，名为 "student_sequence"，
    // 它会在数据库中创建一个名为 "student_sequence" 的序列。
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )
    // 这个注解用于指定主键的生成方式。
    // 这里使用了一个序列生成器，名为 "student_sequence"，
    // 它会在数据库中创建一个名为 "student_sequence" 的序列。
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"
    )
    private Long id;
    private String name;
    private LocalDate dob;
    private String email;
    @Transient
    private Integer age;

    public Student() {
    }
    
    public Student(Long id, String name, LocalDate dob, String email) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public Student(String name, LocalDate dob, String email) {
        this.name = name;
        this.dob = dob;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", dob=" + dob + ", email=" + email + ", age=" + age + "]";
    }
    
}