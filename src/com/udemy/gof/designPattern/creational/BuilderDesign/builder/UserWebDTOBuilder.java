package com.udemy.designPattern.creational.BuilderDesign.builder;

import java.time.LocalDate;
import java.time.Period;

//the concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder {
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthDay(LocalDate date) {
        Period ageInYear = Period.between(date, LocalDate.now());
        age = Integer.toString(ageInYear.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getHouseNumber() + ", " + address.getStreet()
                + "\n" + address.getCity()
                + "\n" + address.getState() + " " + address.getZipCode();
        return this;
    }

    @Override
    public UserDTO build() {
        return new UserWebDTO(firstName + " " + lastName, address, age);
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
