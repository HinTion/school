package org.example.school.service;

import org.example.school.entity.*;

import java.util.*;

/**
    * @author : Hinton
    * @date : 2024/9/19 下午11:06
    */
public interface DistrictService {

    List<District> findByDistrictId(Long id);

    List<District> findByDistrictName(String name);

    List<District> findDetailDistrict(String districtName);
}
