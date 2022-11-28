package com.enigmacamp.student;

import com.enigmacamp.student.config.BeanConfiguration;
import com.enigmacamp.student.container.AppContainer;
import com.enigmacamp.student.model.Major;
import com.enigmacamp.student.model.Student;
import com.enigmacamp.student.repository.StudentRepository;
import com.enigmacamp.student.repository.StudentRepositoryImpl;
import com.enigmacamp.student.service.StudentService;
import com.enigmacamp.student.service.StudentServiceImpl;
import com.enigmacamp.student.validation.EmptyAgeValidation;
import com.enigmacamp.student.validation.StudentAgeValidation;
import com.enigmacamp.student.validation.StudentNameLengthValidation;
import com.enigmacamp.student.validation.Validation;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class AppStudent {
    public static void main(String[] args) {

        AppContainer.run(AppStudent.class);

    }
}
