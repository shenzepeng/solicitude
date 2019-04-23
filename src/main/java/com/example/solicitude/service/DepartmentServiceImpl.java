package com.example.solicitude.service;

import com.example.solicitude.mapper.DepartmentMapper;
import com.example.solicitude.pojo.Department;
import com.example.solicitude.pojo.DepartmentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-25 20:42
 * @Description: SualLabel, Write down some description!!!
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public void insertDepartment(Department department) {
        departmentMapper.insert(department);
    }

    @Override
    public void deleteDepartmentById(long id) {
        departmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateDepartmentById(Department department) {
        departmentMapper.updateByPrimaryKeySelective(department);
    }

    @Override
    public Department findDepartmentById(long id) {
        Department department = departmentMapper.selectByPrimaryKey(id);
        return department;
    }

    @Override
    public List<Department> findDepartmentByUserId(long userId) {
        DepartmentExample departmentExample=new DepartmentExample();
        departmentExample.createCriteria()
                .andUserIdEqualTo(userId);
        List<Department> departments = departmentMapper.selectByExample(departmentExample);
        return departments;
    }


    @Override
    public List<Department> findDepartmentName(String departmentName) {
        DepartmentExample departmentExample=new DepartmentExample();
        departmentExample.createCriteria()
                .andDepartmentNameEqualTo(departmentName);
        List<Department> departments = departmentMapper.selectByExample(departmentExample);
        return departments;
    }

    @Override
    public List<Department> findAllDepartment() {
        DepartmentExample departmentExample=new DepartmentExample();
        departmentExample.createCriteria()
                .getAllCriteria();
        List<Department> departments = departmentMapper.selectByExample(departmentExample);
        return  departments;
    }
}
