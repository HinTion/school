package org.example.school.controller;

import org.example.school.entity.*;
import org.example.school.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
    * @author : Hinton
    * @date : 2024/9/19 下午11:06
    */
@RestController
public class DistrictController {
    @Autowired
    private DistrictService districtService;

    @RequestMapping("/findByDistrictId/{id}")
    public Result <List<District>> findByDistrictId(@PathVariable Long id) {
       List districtList = districtService.findByDistrictId(id);

        if (districtList != null && !districtList.isEmpty()) {
            return new Result<>(1, "查询成功", districtList);
        }else{
            return new Result<>(0, "查询失败", null);
        }
    }
    @RequestMapping("/findByDistrictName/{name}")
    public Result<List<District>> findByDistrictName(@PathVariable String name) {
        List districtList = districtService.findByDistrictName(name);

        if (districtList != null && !districtList.isEmpty()) {
            return new Result<>(1, "查询成功", districtList);
        }else{
            return new Result<>(0, "查询失败", null);
        }

    }

    @RequestMapping("/findDetailDistrict/{districtName}")
    public Result<List<District>> findDetailDistrict(@PathVariable String districtName) {
        List districtList = districtService.findDetailDistrict(districtName);

        if (districtList != null && !districtList.isEmpty()) {
            return new Result<>(1, "查询成功", districtList);
        }else{
            return new Result<>(0, "查询失败", null);
        }
    }

}
