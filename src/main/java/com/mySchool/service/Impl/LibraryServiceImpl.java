package com.mySchool.service.Impl;

import com.mySchool.entity.*;
import com.mySchool.mapper.*;
import com.mySchool.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
* @author : Hinton
* @date : 2024/10/18 上午8:17
*/
@Service
public class LibraryServiceImpl implements LibraryService {
    @Autowired
    private LibraryMapper libraryMapper;

    @Override
    public List<Library> findAll() {
        return libraryMapper.findAll();
    }

    @Override
    public Library findById(Long id) {
        return libraryMapper.findById(id);
    }

    @Override
    public List<Library> findByName(String name) {
        return libraryMapper.findByName(name);
    }

    @Override
    public List<Library> findDetail(String name) {
        return libraryMapper.findDetail(name);
    }
}
