package com.sgouijane.firstspringproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class University {
    @Id
    private Long universityId;
    private String universityAdress;
    private String universityEmail;
}
