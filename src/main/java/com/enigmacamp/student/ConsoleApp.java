package com.enigmacamp.student;

import com.enigmacamp.student.container.AppRunner;
import com.enigmacamp.student.model.Major;
import com.enigmacamp.student.model.Student;
import com.enigmacamp.student.service.StudentService;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ConsoleApp implements AppRunner{

    private final StudentService studentService;

    public ConsoleApp(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void run(String... args) {

        // add data
        studentService.registerStudent(new Student("m", 29, new Major("Biologi")));
        studentService.registerStudent(new Student("lorem ipsum kovar", 18, new Major("informatika")));
        studentService.registerStudent(new Student("Boba", 29, new Major("Fisika")));


        // view all data
        System.out.println("==== View all data ====");
        for (Student student : studentService.getAllStudent()) {
            System.out.println(student);
        }

        /*
        view data by id
        System.out.println("\n==== Find by index ====");
        Student student = studentService.getStudentByIndex(0);
        System.out.println(student);

         delete data
        studentService.unregisterStudent();
         */
    }
}
