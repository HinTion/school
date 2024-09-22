package org.example.school.service;

import org.example.school.entity.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
    * @author : Hinton
    * @date : 2024/9/20 下午3:48
    */
@Service
public interface StreetService {

    List<Street> findByStreetId(Long id);

    List<Street> findByStreetName(String name);

    List<Street> findDetailStreet(String name);
}
