package org.example.school.service.Impl;

import org.example.school.entity.*;
import org.example.school.mapper.*;
import org.example.school.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
    * @author : Hinton
    * @date : 2024/9/20 下午3:47
    */
@Service
public class StreetServiceImpl implements StreetService {
    @Autowired
    private StreetMapper streetMapper;

    @Override
    public List<Street> findByStreetId(Long id) {
        return streetMapper.findById(id);
    }

    @Override
    public List<Street> findByStreetName(String name) {
        return streetMapper.findByName(name);
    }

    @Override
    public List<Street> findDetailStreet(String name) {
        return streetMapper.findDetailStreet(name);
    }
}
