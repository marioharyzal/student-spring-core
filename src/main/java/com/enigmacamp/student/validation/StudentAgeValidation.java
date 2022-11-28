package com.enigmacamp.student.validation;

import com.enigmacamp.student.model.Student;
import com.enigmacamp.student.util.Error;
import com.enigmacamp.student.util.ErrorResponse;
import com.enigmacamp.student.util.ResponseStatus;
import com.enigmacamp.student.util.SuccessResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("studentAgeValidation")
public class StudentAgeValidation implements Validation {
    @Value("${minAge}")
    private int minAge;

    @Override
    public ResponseStatus test(Student s) {
        if (s.getUmur() >= minAge) return new SuccessResponse();
        return new ErrorResponse(Error.INVALID_AGE);
    }

}
