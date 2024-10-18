package com.mySchool.service.Impl;

import com.mySchool.entity.*;
import com.mySchool.mapper.*;
import com.mySchool.service.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

/**
    * @author : sky
    * @date : 2024/9/19 下午8:34
    */
@Service
public class CityServiceImpl implements CityService {
    @Autowired
    private CityMapper cityMapper;

    @Override
    public Result<City> findByCityId(Long id) {
        return Result.success(cityMapper.findByCityId(id));
    }

    @Override
    public Result<City> findByCityName(String name) {
        return Result.success(cityMapper.findByCityName(name));
    }

    @Override
    public Result<City> findDetailCity(String cityName) {
        return Result.success(cityMapper.findDetailCity(cityName));
    }

}
