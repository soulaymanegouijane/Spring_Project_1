package com.sgouijane.firstspringproject.entity;

import lombok.*;
import org.springframework.context.annotation.Scope;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    private long studentId;
}
