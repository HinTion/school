package com.mySchool.entity;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Village {

    private Long villageId;
    private String villageName;
    private Long villageStreet;
}