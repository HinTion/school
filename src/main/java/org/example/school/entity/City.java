package org.example.school.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
    private Long id;
    private String cityName;
    private Long cityProvince;
}