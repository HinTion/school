package org.example.school.mapper;

import org.apache.ibatis.annotations.*;
import org.example.school.entity.*;

import java.util.*;

/**
 * 作者: Hinton
 * 创建时间: 2024-09-07 下午3:46
 */
@Mapper
public interface ClassroomMapper {
    @Select("select * from classroom where classroom_id = #{id}")
    Classroom findByClassroomById (Long id);

    @Select("select * from classroom")
    List<Classroom> list();

    @Insert("insert into classroom(classroom_id ,classroom_name, classroom_position, create_time, update_time) VALUES (0, #{classroomName}, #{classroomPosition}, now(), now())")
    void addClassroom(String classroomName, String classroomPosition);

}
