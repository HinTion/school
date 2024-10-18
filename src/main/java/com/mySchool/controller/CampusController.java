package com.mySchool.controller;

import com.mySchool.entity.*;
import com.mySchool.service.*;


import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * java 版本 "11.0.22" 2024-01-16 LTS
 * @author: Hinton
 * 创建时间: 2024-09-03 下午8:18
 */
@RestController
@RequestMapping("/Campus")
public class CampusController {
    @Autowired
    private CampusService campusService;

    @RequestMapping("/findById")
    public Campus findById(Long id) {
        return campusService.findById(id);
    }

    @RequestMapping("/findByCampusName")
    public List<Campus> findByCampusName(@RequestParam String campusName) {
        return campusService.findByCampusName(campusName);
    }

    @RequestMapping("/findDetailCampus")
    public Result findDetailCampus(@RequestParam String campusName) {
        // 查询校区
        List<Campus> c = campusService.findByCampusName(campusName);
        if (c.isEmpty()) {
            return Result.error("未找到该校区");
        }
        return Result.success(c);

    }

}


