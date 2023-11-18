package com.udemy.SOLID.singleResponsiblePrinciple;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserController {
    private UserPersistenceService persistenceService = new UserPersistenceService();

    //Create a new user
    public String createUser(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        User user = mapper.readValue(userJson, User.class);

        UserValidator validator = new UserValidator();

        if (!validator.isValid(user)) {
            return "ERROR";
        }

        persistenceService.saveUser(user);

        return "SUCCESS";
    }
}
