package com.mySchool.mapper;

import com.mySchool.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.*;

/**
    * @author : Hinton
    * @date : 2024/9/23 上午11:24
    */
@Mapper
public interface UniversityMapper {
    List<University>  findById(Long id);

    List<University> findByUnName(String name);

    List<University> findDetailUniversity(String name);


    @Options(useGeneratedKeys = true, keyProperty = "unId")
    int addUniversity(University un);


    void deleteUniversityById(Long id);
}
