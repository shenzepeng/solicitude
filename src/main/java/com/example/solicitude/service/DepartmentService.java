package com.example.solicitude.service;

import com.example.solicitude.pojo.Department;

import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-25 20:42
 * @Description: SualLabel, Write down some description!!!
 */
public interface DepartmentService {
    void insertDepartment(Department department);
    void deleteDepartmentById(long id);
    void updateDepartmentById(Department department);
    //通过主键id找到
    Department findDepartmentById(long id);
    //通过userId找到
    List<Department> findDepartmentByUserId(long userId);
    //通过机构名称找到
    List<Department> findDepartmentName(String departmentName);
    //显示所有机构
    List<Department> findAllDepartment();
}
