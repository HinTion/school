package com.mySchool.service;

import com.mySchool.entity.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
* @author : Hinton
* @date : 2024/10/13 下午9:25
*/
@Service
public interface BuildingService {
    List<Building> findAll();

    Building findById(Long id);

    List<Building> findByName(String name);

    List<Building> findDetailBuilding(String name);

}
