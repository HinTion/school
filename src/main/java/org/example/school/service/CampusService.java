package org.example.school.service;

import org.example.school.entity.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
 * java 版本 "11.0.22" 2024-01-16 LTS
 * @author: Hinton
 * 创建时间: 2024-09-03 下午7:14
 */
@Service
public interface CampusService {
    Campus findById(Long id);

    public List<Campus> findByCampusName(String name);

    void register(String campusName, String campusAddress);
}
