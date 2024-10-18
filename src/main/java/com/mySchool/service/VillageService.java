package com.mySchool.service;

import com.mySchool.entity.*;

import org.springframework.stereotype.*;

import java.util.*;

/**
    * @author : Hinton
    * @date : 2024/9/22 下午4:44
    */
@Service
public interface VillageService {
    List<Village> findByVillageId(Long id);

    List<Village> findByVillageName(String name);

    List<Village> findDetailVillage(String name);
}
