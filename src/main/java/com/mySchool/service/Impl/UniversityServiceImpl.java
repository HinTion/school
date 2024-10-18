package com.mySchool.service.Impl;

import com.mySchool.entity.*;
import com.mySchool.mapper.*;
import com.mySchool.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

/**
    * @author : Hinton
    * @date : 2024/9/23 上午11:25
    */
@Service
public class UniversityServiceImpl implements UniversityService {

   @Autowired
   private UniversityMapper universityMapper;

   @Override
   public Result findByUnID(Long id) {
      List<University> university = universityMapper.findById(id);
      if (university.isEmpty()) {
         return Result.error("未找到 University");
      }
      return Result.success(university);
   }

   @Override
   public Result findByUnName(String name) {
      List<University> university = universityMapper.findByUnName(name);
      if (university.isEmpty()) {
         return Result.error("未找到 University");
      }
      return Result.success(university);
   }

   @Override
   public Result findDetailUniversity(String name) {
      List<University> university = universityMapper.findDetailUniversity(name);
      if (university.isEmpty()) {
         return Result.error("未找到 University");
      }
      return Result.success(university);
   }

   @Override
   public Result addUniversity(University university) {
      if (university.getUnName() == null){
         return Result.error("请输入 University 名称");
      }
      university.setUnId(0L);
      universityMapper.addUniversity(university);
      return Result.success("添加大学成功");
   }

   @Override
   public Result deleteUniversityById(Long id) {
      universityMapper.deleteUniversityById(id);
      return Result.success("删除 University 成功");
   }
}
