package com.mySchool.controller;

import com.mySchool.entity.*;
import com.mySchool.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
* @author : Hinton
* @date : 2024/10/18 上午9:28
*/
@RestController
@RequestMapping("/Book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/findAll")
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/findById")
    public Book findById(Long id) {
        return bookService.findById(id);
    }

    @GetMapping("/findByName")
    public List<Book> findByName(@RequestParam String name) {
        return bookService.findByName(name);
    }

    @GetMapping("/findDetail")
    public Result findDetail(@RequestParam String name) {
        List<Book> result = bookService.findDetail(name);
        if (result.isEmpty()) {
            return Result.error("未找到该图书馆");
        }
        return Result.success(result);
    }
}
