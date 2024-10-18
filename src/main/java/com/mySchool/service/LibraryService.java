package com.mySchool.service;

import com.mySchool.entity.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
* @author : Hinton
* @date : 2024/10/18 上午8:16
*/
@Service
public interface LibraryService {
     List<Library> findAll();

     Library findById(Long id);

     List<Library> findByName(String name);

    List<Library> findDetail(String name);
}
