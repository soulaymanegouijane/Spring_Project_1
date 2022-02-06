package com.sgouijane.firstspringproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departementId;
    @NotBlank(message = "Please Provide a Department name")
    private String departementName;

    private String departementAdress;
    @PositiveOrZero(message = "the department code shouldn't be negative !")
    private String departementCode;
}
