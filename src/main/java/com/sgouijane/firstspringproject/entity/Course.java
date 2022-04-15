package com.sgouijane.firstspringproject.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    private Long courseId;
    private String courseTitle;
    private Long courseCredits;
    private Date examDate;

    @OneToOne
    @JoinColumn(name="student_id")
    private Student student;
}
