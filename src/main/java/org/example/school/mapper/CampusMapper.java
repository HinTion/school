package org.example.school.mapper;

import org.apache.ibatis.annotations.*;
import org.example.school.entity.*;

import java.util.*;

/**
 * java 版本 "11.0.22" 2024-01-16 LTS
 * @author: Hinton
 * 创建时间: 2024-09-03 下午7:12
 */
@Mapper
public interface CampusMapper {
    @Select("select * from campus where campus_id = #{campusId}")
    Campus findById(Long campusId);

    @Select("select * from campus where campus_name = #{campusName}")
    List<Campus> findByCampusName(String campusName);

    @Insert("insert into campus (campus_name, campus_address, create_time, update_time, is_deleted)" +
            "           values  (#{campusName},#{campusAddress}, NOW(), NOW(), 0) ")
    void register(String campusName, String campusAddress);
}
