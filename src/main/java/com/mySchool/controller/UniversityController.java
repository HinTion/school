package com.mySchool.controller;

import com.mySchool.entity.*;
import com.mySchool.entity.Result;
import com.mySchool.service.*;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

/**
    * @author : Hinton
    * @date : 2024/9/23 上午11:23
    */
@RestController
public class UniversityController {
    @Autowired
    private UniversityService universityService;

    @GetMapping("/findByUnID")
    public Result findByUnID(@RequestParam Long id) {
        return universityService.findByUnID(id);
    }

    @GetMapping("/findByUnName")
    public Result findByUnName(@RequestParam String name) {
        return universityService.findByUnName(name);
    }

    @GetMapping("/findDetailUniversity")
    public Result findDetailUniversity(@RequestParam String name) {
        return universityService.findDetailUniversity(name);
    }

    @PostMapping("/addUniversity")
    public Result addUniversity(@RequestBody University university) {
        return universityService.addUniversity(university);
    }

    @DeleteMapping
    public Result deleteUniversityById(@RequestParam Long id){
        return universityService.deleteUniversityById(id);
    }

}
