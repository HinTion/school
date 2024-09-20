package org.example.school.service.Impl;

import org.example.school.entity.*;
import org.example.school.mapper.*;
import org.example.school.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
    * @author : Hinton
    * @date : 2024/9/19 下午11:07
    */
@Service
public class DistrictServiceImpl implements DistrictService {
    @Autowired
    private DistrictMapper districtMapper;

    @Override
    public List<District> findByDistrictId(Long id) {
        return districtMapper.findById(id);
    }
    @Override
    public List<District> findByDistrictName(String name) {
        return districtMapper.findByName(name);
    }

    @Override
    public List<District> findDetailDistrict(String districtName) {
        return districtMapper.findDetailDistrict(districtName);
    }
}
