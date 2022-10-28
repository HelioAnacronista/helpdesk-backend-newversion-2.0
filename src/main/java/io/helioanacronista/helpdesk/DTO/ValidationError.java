package io.helioanacronista.helpdesk.DTO;

import io.helioanacronista.helpdesk.DTO.CustomError;
import io.helioanacronista.helpdesk.DTO.FieldMessage;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError {


    private List<FieldMessage> errors = new ArrayList<>();

    public ValidationError(Instant timestamp, Integer status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public void addError(String fieldName, String message){
        errors.add(new FieldMessage(fieldName, message));
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }
}