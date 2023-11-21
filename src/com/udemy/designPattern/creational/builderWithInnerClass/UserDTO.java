package com.udemy.designPattern.creational.builderWithInnerClass;


import java.time.LocalDate;
import java.time.Period;

//A Product in builder pattern
public class UserDTO {
    private String name;
    private String address;
    private String age;

    public UserDTO() {
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAge() {
        return age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setAge(String age) {
        this.age = age;
    }

    public String toString() {
        return "{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", age='" + age + '\'' + '}';
    }

    public static UserDTOBuilder getBuilder() {
        return new UserDTOBuilder();
    }

    //Builder
    public static class UserDTOBuilder {
        private String firstName;
        private String lastName;
        private String age;
        private String address;
        private UserDTO dto;

        public UserDTOBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDTOBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDTOBuilder withBirthDay(LocalDate date) {
            Period ageInYear = Period.between(date, LocalDate.now());
            age = Integer.toString(ageInYear.getYears());
            return this;
        }

        public UserDTOBuilder withAddress(Address address) {
            this.address = address.getHouseNumber() + ", " + address.getStreet() + "\n" + address.getCity() + "\n" + address.getState() + " " + address.getZipCode();
            return this;
        }


        public UserDTO build() {
            this.dto = new UserDTO();
            dto.setName(firstName + " " + lastName);
            dto.setAddress(address);
            dto.setAge(age);
            return dto;
        }

        public UserDTO getUserDTO() {
            return this.dto;
        }
    }
}
