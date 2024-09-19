package org.example.school.entity;

import jakarta.validation.constraints.*;
import lombok.*;

import javax.persistence.*;
import java.time.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classroom {
    private Long classroomId;
    private String classroomName;
    private String classroomPosition;
    private Instant createTime;
    private Instant updateTime;
}