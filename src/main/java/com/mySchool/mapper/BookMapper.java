package com.mySchool.mapper;

import com.mySchool.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.*;

/**
* @author : Hinton
* @date : 2024/10/18 上午9:29
*/
@Mapper
public interface BookMapper {
    List<Book> findAll();

    Book findById(int id);

    List<Book> findByName(String name);

    List<Book> findDetail(String name);
}
