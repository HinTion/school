package org.example.school.controller;

import org.apache.catalina.*;
import org.example.school.entity.*;
import org.example.school.service.*;
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

    @RequestMapping("/register")
    public Result register(@RequestParam String campusName, @RequestParam String campusAddress) {
        // 查询校区
        List<Campus> c = campusService.findByCampusName(campusName);

       if (c == null) {
            // 没有占用
            // 注册
            campusService.register(campusName, campusAddress);
            return Result.success();
        }
        else {
            return Result.error("校区名称已占用");
        }
    }

}


