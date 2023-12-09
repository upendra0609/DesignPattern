package com.udemy.designPattern.structural.adapterPattern.cobjectAdapter;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


//Adaptee class
@ToString
@Getter
@Setter
public class Employee {
    private String fullName;
    private String jobTitle;
    private String officeLocation;

}
