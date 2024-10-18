package com.mySchool.service;

import com.mySchool.entity.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
* @author : Hinton
* @date : 2024/10/18 上午9:29
*/
@Service
public interface BookService {
    List<Book> findAll();

    Book findById(Long id);

    List<Book> findByName(String name);

    List<Book> findDetail(String name);

}
