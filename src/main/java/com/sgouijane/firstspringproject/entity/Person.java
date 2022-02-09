package com.sgouijane.firstspringproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person {
    private String firstName;
    private String lastName;
    private String emailAdress;
    private Long age;
}
