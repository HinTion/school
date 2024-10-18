package com.mySchool.service.Impl;

import com.mySchool.entity.*;
import com.mySchool.mapper.*;
import com.mySchool.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
* @author : Hinton
* @date : 2024/10/13 下午9:44
*/
@Service
public class BuildingServiceImpl implements BuildingService {
    @Autowired
    private BuildingMapper buildingMapper;

    @Override
    public List<Building> findAll() {
        return buildingMapper.findAll();
    }

    @Override
    public Building findById(Long id) {
        return buildingMapper.findById(id);
    }

    @Override
    public List<Building> findByName(String name) {
        return buildingMapper.findByName(name);
    }

    @Override
    public List<Building> findDetailBuilding(String name) {
        return buildingMapper.findDetailBuilding(name);
    }
}
