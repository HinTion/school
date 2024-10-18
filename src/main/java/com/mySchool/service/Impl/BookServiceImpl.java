package com.mySchool.service.Impl;

import com.mySchool.entity.*;
import com.mySchool.mapper.*;
import com.mySchool.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
* @author : Hinton
* @date : 2024/10/18 上午9:29
*/
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> findAll() {
        return bookMapper.findAll();
    }

    @Override
    public Book findById(Long id) {
        return bookMapper.findById(Math.toIntExact(id));
    }

    @Override
    public List<Book> findByName(String name) {
        return bookMapper.findByName(name);
    }

    @Override
    public List<Book> findDetail(String name) {
        return bookMapper.findDetail(name);
    }

}
