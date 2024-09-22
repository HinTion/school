package org.example.school.controller;

import org.example.school.entity.*;
import org.example.school.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

/**
    * @author : Hinton
    * @date : 2024/9/20 下午3:41
    */
@RestController
public class StreetController {
    @Autowired
    private StreetService streetService;

    @GetMapping("/findByStreetId/{id}")
    public Result findByStreetId(@PathVariable Long id) {
        return Result.success(streetService.findByStreetId(id));
    }

    @GetMapping("/findByStreetName/{name}")
    public Result findByStreetName(@PathVariable String name) {
        return Result.success(streetService.findByStreetName(name));
    }

    @GetMapping("/findDetailStreet/{name}")
    public Result findDetailStreet(@PathVariable String name) {
        return Result.success(streetService.findDetailStreet(name));
    }
    

}



