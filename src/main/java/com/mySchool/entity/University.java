package com.mySchool.entity;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class University {
    private Long unId;
    private String unName;
    private String unVillage;
}