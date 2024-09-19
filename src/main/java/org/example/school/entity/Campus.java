package org.example.school.entity;

import jdk.jfr.*;
import lombok.*;

import java.time.*;
import javax.persistence.*;
/**
 * java 版本 "11.0.22" 2024-01-16 LTS
 * @author: Hinton
 * 创建时间: 2024-09-03 下午4:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Campus {
    private Long campusId;
    private String campusName;
    private String campusAddress;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
    private Integer deleted;
}
