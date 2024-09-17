package com.jinliangyan.demo.student;

import java.time.LocalDate;
import static java.time.Month.JANUARY;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student jinliang = new Student(
                "JinliangYan", 
                LocalDate.of(2000, JANUARY, 1), 
                "jinliangyan@gmail.com"
            );

            Student alex = new Student(
                "Alex", 
                LocalDate.of(2004, JANUARY, 1), 
                "alex@gmail.com"
            );

            studentRepository.saveAll(List.of(jinliang, alex));
        };
    }

}
