package org.example.school.service.Impl;

import org.example.school.entity.*;
import org.example.school.mapper.*;
import org.example.school.service.*;
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

}
