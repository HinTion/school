package org.example.school.entity;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class University {
    private Long unId;
    private String unName;
    private String unDistrict;
}