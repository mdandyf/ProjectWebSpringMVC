package com.mitrais.validator;

import com.mitrais.model.FileModel;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class FileValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return FileModel.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "file", "required.file", "Field file cannot be emptied");
    }
}
