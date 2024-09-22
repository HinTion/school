package org.example.school.mapper;

import org.apache.ibatis.annotations.*;
import org.example.school.entity.*;

import java.util.*;

/**
    * @author : Hinton
    * @date : 2024/9/20 下午3:47
    */
@Mapper
public interface StreetMapper {

    @Select("select * from street where street_id = #{id}")
    List<Street> findById(Long id);

    @Select("select * from street where street_name = #{name}")
    List<Street> findByName(String name);

    @Select("select * from street join district on street_district = district_id join city on district_city = city_id join province on city_province = province_id where street_name like CONCAT('%', #{name}, '%')")
    List<Street> findDetailStreet(String name);
}
