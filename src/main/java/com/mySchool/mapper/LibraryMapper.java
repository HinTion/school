package com.mySchool.mapper;

import com.mySchool.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.*;

/**
* @author : Hinton
* @date : 2024/10/18 上午8:17
*/
@Mapper
public interface LibraryMapper {
    List<Library> findAll();

    Library findById(Long id);

    List<Library> findByName(String name);

    List<Library> findDetail(String name);
}
