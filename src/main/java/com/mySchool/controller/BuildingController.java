package com.mySchool.controller;

import com.mySchool.entity.*;
import com.mySchool.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
* @author : Hinton
* @date : 2024/10/13 下午9:24
*/
@RestController
@RequestMapping("/Building")
public class BuildingController {
    @Autowired
    private BuildingService buildingService;

    @RequestMapping("/findAll")
    public List<Building> findAll() {
        return buildingService.findAll();
    }

    @RequestMapping("/findByName")
    public List<Building> findByName(@RequestParam String name) {
        return buildingService.findByName(name);
    }

    @RequestMapping("/findById")
    public Building findById(Long id) {
        return buildingService.findById(id);
    }

    @RequestMapping("/findDetail")
    public Result findDetailBuilding(@RequestParam String buildingName) {
        List<Building> buildings = buildingService.findDetailBuilding(buildingName);
        if (buildings.isEmpty()) {
            return Result.error("未找到该建筑");
        }
        return Result.success(buildings);
    }
}
