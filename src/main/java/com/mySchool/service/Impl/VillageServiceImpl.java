package com.mySchool.service.Impl;

import com.mySchool.entity.*;
import com.mySchool.mapper.*;
import com.mySchool.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
    * @author : Hinton
    * @date : 2024/9/22 下午4:44
    */
@Service
public class VillageServiceImpl implements VillageService {
    @Autowired
    VillageMapper villageMapper;

    @Override
    public List<Village> findByVillageId(Long id) {
        return villageMapper.findById(id);
    }

    @Override
    public List<Village> findByVillageName(String name) {
        return villageMapper.findByVillageName(name);
    }

    @Override
    public List<Village> findDetailVillage(String name) {
        return villageMapper.findDetailVillage(name);
    }
}
