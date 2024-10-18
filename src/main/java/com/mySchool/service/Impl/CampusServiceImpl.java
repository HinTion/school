package com.mySchool.service.Impl;

import com.mySchool.entity.*;
import com.mySchool.mapper.*;
import com.mySchool.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
 * java 版本 "11.0.22" 2024-01-16 LTS
 * @author: Hinton
 * 创建时间: 2024-09-03 下午7:15
 */
@Service
public class CampusServiceImpl implements CampusService {
    @Autowired
    private CampusMapper campusMapper;

    @Override
    public Campus findById(Long id){
        return campusMapper.findById(id);
    }

    @Override
    public List<Campus> findByCampusName(String name){
        return campusMapper.findByCampusName(name);
    }

    @Override
    public List<Campus> findDetailCampus(String campusName) {
        return campusMapper.findDetailCampus(campusName);
    }

}
