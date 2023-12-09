package com.udemy.designPattern.creational.BuilderDesign.builderWithInnerClass;


import java.time.LocalDate;

//this is our client which also works as "director"
public class Client {
    public static void main(String[] args) {
        User user = createUser();
        UserDTO.UserDTOBuilder builder = UserDTO.getBuilder();
        UserDTO dto = directBuild(builder, user);
        System.out.println(dto);

    }

    //this method serves the role of director in builder pattern.
    private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user) {
        return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
                .withAddress(user.getAddress()).withBirthDay(user.getBirthDay())
                .build();
    }

    //return a sample user
    public static User createUser() {
        User user = new User();
        user.setBirthDay(LocalDate.of(1960, 5, 13));
        user.setFirstName("Roy");
        user.setLastName("Swanson");
        Address address = new Address();
        address.setHouseNumber("100");
        address.setStreet("State street");
        address.setCity("Pune");
        address.setState("Maharashtra");
        address.setZipCode("404146");
        user.setAddress(address);
        return user;
    }
}
