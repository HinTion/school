package com.mySchool.mapper;

import com.mySchool.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.*;

/**
 * java 版本 "11.0.22" 2024-01-16 LTS
 * @author: Hinton
 * 创建时间: 2024-09-03 下午7:12
 */
@Mapper
public interface CampusMapper {
    Campus findById(Long campusId);

    List<Campus> findByCampusName(String campusName);

    List<Campus> findDetailCampus(String campusName);
}
