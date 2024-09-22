package org.example.school.entity;

import lombok.*;

/**
    * @author : Hinton
    * @date : 2024/9/20 下午3:44
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Street {
    private Long streetId;
    private String streetName;
    private Long streetDistrict;
}
