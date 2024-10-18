package com.mySchool.mapper;

import com.mySchool.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.*;

/**
    * @author : Hinton
    * @date : 2024/9/19 下午11:08
    */
@Mapper
public interface DistrictMapper {


    @Select("select * from district where district_id = #{id}")
    List<District> findById(Long id) ;

    @Select("select * from district where district_name = #{name}")
    List<District> findByName(String name) ;

    @Select("select * from province join  city on  city_province = province_id join district on district_city = city_id where district.district_name like CONCAT('%', #{districtName}, '%')")
    List<District> findDetailDistrict(String districtName) ;
}
