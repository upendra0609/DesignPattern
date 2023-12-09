package com.udemy.designPattern.creational.BuilderDesign.builder;

import java.time.LocalDate;

//abstract builder
public interface UserDTOBuilder {
    //method to build "parts" of product at a time
    UserDTOBuilder withFirstName(String firstName);

    UserDTOBuilder withLastName(String lastName);

    UserDTOBuilder withBirthDay(LocalDate date);

    UserDTOBuilder withAddress(Address address);

    //method to assemble "parts" final product
    UserDTO build();

    //(optional) method to fetch already fetch built object
    UserDTO getUserDTO();
}
