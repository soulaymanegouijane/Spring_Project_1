package com.sgouijane.firstspringproject.entity;

import lombok.*;
import net.bytebuddy.implementation.bind.annotation.Super;
import net.bytebuddy.implementation.bind.annotation.SuperCall;
import org.springframework.context.annotation.Scope;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student extends Person {
    @Id
    private long studentId;

    @OneToOne(mappedBy = "student")
    private Course course;
}
