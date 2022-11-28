package com.enigmacamp.student.validation;

import com.enigmacamp.student.model.Student;
import com.enigmacamp.student.util.ResponseStatus;
import com.enigmacamp.student.util.SuccessResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//
//@Component
//@Qualifier("emptyAgeValidation")
public class EmptyAgeValidation implements Validation {

    @Override
    public ResponseStatus test(Student s) {
        return new SuccessResponse();
    }

}
