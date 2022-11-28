package com.enigmacamp.student.validation;

import com.enigmacamp.student.model.Student;
import com.enigmacamp.student.util.Error;
import com.enigmacamp.student.util.ErrorResponse;
import com.enigmacamp.student.util.ResponseStatus;
import com.enigmacamp.student.util.SuccessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("studentNameLengthValidation")
public class StudentNameLengthValidation implements Validation {


    @Value("${minLengthName}")
    private int minLen;

    @Value("${maxLengthName}")
    private int maxLen;

    @Override
    public ResponseStatus test(Student s) {
        if (s.getFullName().length() >= minLen && s.getFullName().length() <= maxLen) return new SuccessResponse();
        return new ErrorResponse(Error.INVALID_LENGTH_NAME);
    }
}
