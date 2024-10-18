package com.mySchool.controller;

import com.mySchool.entity.*;
import com.mySchool.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
* @author : Hinton
* @date : 2024/10/18 上午8:16
*/
@RestController
@RequestMapping("/Library")
public class LibraryController {
    @Autowired
    private LibraryService libraryService;

    @RequestMapping("/findAll")
    public List<Library> findAll() {
        return libraryService.findAll();
    }

    @RequestMapping("/findById")
    public Library findById(Long id) {
        return libraryService.findById(id);
    }

    @RequestMapping("/findByName")
    public List<Library> findByName(@RequestParam String name) {
        return libraryService.findByName(name);
    }

    @RequestMapping("/findDetail")
    public Result findDetail(@RequestParam String name) {
        List<Library> result = libraryService.findDetail(name);
        if (result.isEmpty()) {
            return Result.error("未找到该图书馆");
        }
        return Result.success(result);
    }
}
