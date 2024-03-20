package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;
//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;


    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1L, "Learn AWS Now!", "in28minutes"));
        repository.save(new Course(2L, "Learn AWS", "in28minutes"));
        repository.save(new Course(3L, "Learn AWS Now!", "in28minutes"));
        repository.deleteById(1L);

        System.out.println(repository.findById(2L));

        System.out.println(repository.findByAuthor(""));
        System.out.println(repository.findByName("Learn AWS Now!"));

    }

}
