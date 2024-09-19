package org.example.school.service;

import org.example.school.entity.*;
import org.springframework.stereotype.*;

/**
 * 作者: Hinton
 * 创建时间: 2024-09-07 下午3:59
 */
@Service
public interface ClassroomService {
    Classroom findById(Long id);

    void addClassroom(String classroomName, String classroomPosition);
}
