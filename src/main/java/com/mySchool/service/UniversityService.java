package com.mySchool.service;

import com.mySchool.entity.*;
import org.springframework.stereotype.*;
import java.util.*;

/**
    * @author : Hinton
    * @date : 2024/9/23 上午11:25
    */
@Service
public interface UniversityService {
    Result findByUnID(Long id);

    Result  findByUnName(String name);

    Result  findDetailUniversity(String name);

    Result addUniversity(University university);

    Result deleteUniversityById(Long id);
}
