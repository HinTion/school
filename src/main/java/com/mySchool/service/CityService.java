package com.mySchool.service;

import com.mySchool.entity.*;
import com.mySchool.entity.Result;

import org.springframework.stereotype.*;

/**
    * @author : Hinton
    * @date : 2024/9/19 下午8:35
    */
@Service
public interface CityService {

    Result<City> findByCityId(Long id);

    Result<City> findByCityName(String name);

    Result<City> findDetailCity(String cityName);
}
