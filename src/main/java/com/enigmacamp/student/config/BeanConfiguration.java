package com.enigmacamp.student.config;

import com.enigmacamp.student.repository.StudentRepository;
import com.enigmacamp.student.repository.StudentRepositoryImpl;
import com.enigmacamp.student.service.StudentService;
import com.enigmacamp.student.service.StudentServiceImpl;
import com.enigmacamp.student.validation.EmptyAgeValidation;
import com.enigmacamp.student.validation.MaxDataValidation;
import com.enigmacamp.student.validation.StudentNameLengthValidation;
import com.enigmacamp.student.validation.Validation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:app.properties")
public class BeanConfiguration {

    /*
    @Bean
    public Validation getNameLengthValidation() {
        return new StudentNameLengthValidation(minLengthName,maxLengthName);
    }

    @Bean
    public Validation getAgeValidation() {
        return new EmptyAgeValidation();
    }

    @Bean
    public StudentService getStudentService() {
        return new StudentServiceImpl(getStudentRepository(), getAgeValidation(), getNameLengthValidation());
    }
    */

}
