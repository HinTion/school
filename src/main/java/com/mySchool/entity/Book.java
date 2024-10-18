package com.mySchool.entity;

import lombok.*;

/**
* @author : Hinton
* @date : 2024/10/13 下午9:18
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Long bookId;
    private String bookName;
    private String bookSn;
    private Long bookLibrary;
}
