package com.mySchool.mapper;

import com.mySchool.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.*;

/**
* @author : Hinton
* @date : 2024/10/13 下午9:47
*/
@Mapper
public interface BuildingMapper {
    List<Building> findAll();

    Building findById(Long id);

    List<Building> findByName(String name);

    List<Building> findDetailBuilding(String buildingName);
}
