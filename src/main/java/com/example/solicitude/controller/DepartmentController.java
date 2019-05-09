package com.example.solicitude.controller;

import com.example.solicitude.pojo.Department;
import com.example.solicitude.service.DepartmentService;
import com.example.solicitude.utils.SzpJsonResult;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.ResultType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-25 20:41
 * @Description: SualLabel, Write down some description!!!
 */
@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @ApiOperation("添加department")
    @PostMapping("/insertDepartment.action")
    public SzpJsonResult insertDepartment(@RequestBody Department department) {
        Long userId = department.getUserId();
        List<Department> departmentByUserId = departmentService.findDepartmentByUserId(userId);
        if (departmentByUserId==null||departmentByUserId.size()==0){
            departmentService.insertDepartment(department);
            return SzpJsonResult.ok();
        }else {
            return SzpJsonResult.errorMsg("已经添加过了，无法再添加");
        }


    }

    @ApiOperation("通过主键id删除department")
    @DeleteMapping("/deleteDepartmentById.action")
    public SzpJsonResult deleteDepartmentById(@RequestBody long id) {

        departmentService.deleteDepartmentById(id);
        return SzpJsonResult.ok();
    }

    //根据主键跟新，值不为null的字段
    @ApiOperation("根据主键跟新，值不为null的字段")
    @PutMapping("/updateDepartmentById.action")
    public SzpJsonResult updateDepartmentById(@RequestBody Department department) {
        Department departmentById = departmentService.findDepartmentById(department.getId());
        department.setUserId(departmentById.getUserId());
        departmentService.updateDepartmentById(department);
        return SzpJsonResult.ok();
    }

    //通过主键id找到
    @ApiOperation("通过主键id找到")
    @GetMapping("/findDepartmentById.action")
    public SzpJsonResult findDepartmentById(long id) {

        Department departmentById = departmentService.findDepartmentById(id);
        return SzpJsonResult.ok(departmentById);
    }

    //通过userId找到
    @ApiOperation("通过userId找到")
    @GetMapping("/findDepartmentByUserId.action")
    public SzpJsonResult findDepartmentByUserId(long userId) {

        List<Department> departmentByUserId = departmentService.findDepartmentByUserId(userId);
        if (departmentByUserId!=null&&departmentByUserId.size()!=0) {
            return SzpJsonResult.ok(departmentByUserId.get(0));
        }else {
            return SzpJsonResult.errorMsg("没有找到");
        }
    }

    //通过机构名称找到
    @ApiOperation("通过机构名称找到")
    @GetMapping("/findDepartmentName.action")
    public SzpJsonResult findDepartmentName(String departmentName) {

        List<Department> departmentName1 = departmentService.findDepartmentName(departmentName);
        return SzpJsonResult.ok(departmentName1);
    }

    @ApiOperation("显示全部机构")
    @GetMapping("/findAllDepartment.action")
    public SzpJsonResult findAllDepartment() {
        List<Department> allDepartment = departmentService.findAllDepartment();
        return SzpJsonResult.ok(allDepartment);
    }
}
