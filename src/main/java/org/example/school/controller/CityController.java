package org.example.school.controller;

import org.example.school.entity.*;
import org.example.school.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

/**
    * @author : sky
    * @date : 2024/9/19 下午8:34
    */
@RestController
public class CityController {
    @Autowired
    private CityService cityService;


    @RequestMapping("/findByCityId/{id}")
    public Result<City> findByCityId(@PathVariable Long id) {
        return cityService.findByCityId(id);
    }

    @RequestMapping("/findByCityName/{cityName}")
    public Result<City> findByCityName(@PathVariable String cityName) {
        return cityService.findByCityName(cityName);
    }

    @RequestMapping("/findDetailCity/{cityName}")
    public Result<City> findDetailCity(@PathVariable String cityName) {
        return cityService.findDetailCity(cityName);
    }




}
