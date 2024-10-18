package com.mySchool.controller;

import com.mySchool.entity.*;
import com.mySchool.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
* @author : Hinton
* @date : 2024/9/22 下午4:41
*/
@RestController
public class VillageController {
    @Autowired
    VillageService villageService;

    @GetMapping("/findByVillageId/{id}")
    public Result findByVillageId(@PathVariable Long id) {
        List<Village> villageList = villageService.findByVillageId(id);
        return Result.success(villageList);
    }

    @GetMapping("/findByVillageName/{name}")
    public Result findByVillageName(@PathVariable String name) {
        List<Village> villageList = villageService.findByVillageName(name);
        if (villageList.isEmpty()) {
            return Result.error("未找到该名字");
        }
        return Result.success(villageList);
    }

    @GetMapping("/findDetailVillage/{name}")
    public Result findDetailVillage(@PathVariable String name) {
        if (name == null) {
            return Result.error("请输入名字");
        }
        List<Village> villageList = villageService.findDetailVillage(name);
        if (villageList.isEmpty()) {
            return Result.error("未找到该名字");
        }
        return Result.success(villageList);
    }
}
