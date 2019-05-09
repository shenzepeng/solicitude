package com.example.solicitude;

import com.example.solicitude.mapper.DepartmentMapper;
import com.example.solicitude.pojo.Department;
import com.example.solicitude.pojo.DepartmentExample;
import com.example.solicitude.service.DepartmentService;
import io.swagger.annotations.ApiOperation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SolicitudeApplicationTests {
    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private DepartmentMapper departmentMapper;
    @Test
    public void contextLoads() {
        List<Department> departmentByUserId = departmentService.findDepartmentByUserId(2);
        System.out.println(departmentByUserId);
    }
    @Test
    public void find(){
        DepartmentExample example=new DepartmentExample();
        example.createCriteria()
                .andUserIdEqualTo((long) 2);
        List<Department> departments = departmentMapper.selectByExample(example);
        System.out.println(departments);
    }
}
