package com.mySchool.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @author sky
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class City {
    private Long id;
    private String cityName;
    private Long cityProvince;
}