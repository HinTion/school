package org.example.school.entity;

import jakarta.validation.constraints.*;
import lombok.*;

import javax.persistence.*;
import java.time.*;

@Getter
@Setter
@Entity
@Table(name = "student", schema = "school")
public class Student {
    @Id
    @Column(name = "student_id", nullable = false)
    private Long id;

    @Size(max = 255)
    @Column(name = "student_name")
    private String studentName;

    @Size(max = 255)
    @Column(name = "student_campus")
    private String studentCampus;

    @Size(max = 255)
    @Column(name = "student_age")
    private String studentAge;

    @Size(max = 255)
    @Column(name = "student_bed")
    private String studentBed;

    @Size(max = 255)
    @Column(name = "student_major")
    private String studentMajor;

    @Column(name = "student_entertime")
    private Instant studentEntertime;

    @Column(name = "student_leavetime")
    private Instant studentLeavetime;

}