package org.example.school.controller;

import org.example.school.entity.*;
import org.example.school.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.format.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.time.*;
import java.util.function.*;

/**
 * 作者: Hinton
 * 创建时间: 2024-09-07 上午10:54
 */
@RestController
@RequestMapping("/Classroom")
public class ClassroomController {
    @Autowired
    private ClassroomService classroomService;

    @GetMapping("/findById/{id}")
    public Classroom findById(@PathVariable Long id) {
        Classroom c = classroomService.findById(id);
        System.out.println(c);
        return c;
    }

    @RequestMapping("/add")
    public Result add(@RequestParam(name = "classroomName") String name, @RequestParam(name= "classroomPosition") String pos) {
        classroomService.addClassroom(name, pos);
        return Result.success();
    }



}
