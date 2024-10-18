package com.mySchool.entity;

import lombok.*;

/**
 * @author : Hinton
 * @date : 2024/10/13 下午9:05
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Library {
   private Long libraryId;
   private String libraryName;
   private Long libraryBuilding;
}
