package org.example.school.service.Impl;

import org.example.school.entity.*;
import org.example.school.mapper.*;
import org.example.school.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

/**
 * 作者: Hinton
 * 创建时间: 2024-09-07 下午4:02
 */
@Service
public class ClassroomServiceImpl implements ClassroomService {
    @Autowired
    private ClassroomMapper classroomMapper;

    @Override
    public Classroom findById(Long id) {
        return classroomMapper.findByClassroomById(id);
    }

    @Override
    public void addClassroom(String classroomName ,String classroomPosition) {
        classroomMapper.addClassroom(classroomName ,classroomPosition);
    }


}
