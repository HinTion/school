package org.example.school.entity;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class District {
    private Long districtId;
    private String districtName;
    private Long districtCity;
}