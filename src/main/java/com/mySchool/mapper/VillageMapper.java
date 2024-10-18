package com.mySchool.mapper;

import com.mySchool.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.*;

/**
    * @author : Hinton
    * @date : 2024/9/22 下午4:44
    */
@Mapper
public interface VillageMapper {

    List<Village> findById(Long id);

    List<Village> findByVillageName(String name);

    List<Village> findDetailVillage(String name);
}
