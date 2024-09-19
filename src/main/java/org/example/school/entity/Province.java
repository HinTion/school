package org.example.school.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Province {

    private Long provinceId;
    private String provinceName;
}