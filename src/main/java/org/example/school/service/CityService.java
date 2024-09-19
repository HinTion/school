package org.example.school.service;

import org.apache.ibatis.annotations.*;
import org.example.school.entity.*;
import org.example.school.entity.Result;
import org.springframework.stereotype.*;

/**
    * @author : Hinton
    * @date : 2024/9/19 下午8:35
    */
@Service
public interface CityService {

    Result<City> findByCityId(Long id);

    Result<City> findByCityName(String name);
}
