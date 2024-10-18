package com.mySchool.entity;

import lombok.*;

/**
* @author : Hinton
* @date : 2024/10/13 下午9:16
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Building {
    private Long buildingId;
    private String buildingName;
    private Long buildingType;
    private Long buildingCampus;
}
