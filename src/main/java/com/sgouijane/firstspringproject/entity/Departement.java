package com.sgouijane.firstspringproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long DepartementId;

    private String DepartementName;

    private String DepartementAdress;

    private String DepartementCode;
}
