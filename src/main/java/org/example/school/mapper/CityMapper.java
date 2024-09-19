package org.example.school.mapper;

import org.apache.ibatis.annotations.*;
import org.example.school.entity.*;

/**
    * @author : sky
    * @date : 2024/9/19 下午8:28
    */
@Mapper
public interface CityMapper {
    @Select("select * from city where city_id = #{id}")
    City findByCityId(Long id);

    @Select("select * from city where city_name = #{cityName}")
    City findByCityName(String name);

    @Select("select * from province join  city on  city_province = province_id where city_name like #{cityName}")
    City findDetailCity(String cityName);
}
