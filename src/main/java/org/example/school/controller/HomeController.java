package org.example.school.controller;

import org.springframework.web.bind.annotation.*;

/**
 * java 版本 "11.0.22" 2024-01-16 LTS
 * @author: Hinton
 * 创建时间: 2024-09-03 下午4:02
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "hello ";
    }

}
