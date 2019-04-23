package com.example.solicitude.controller;

import com.example.solicitude.pojo.Elder;
import com.example.solicitude.service.ElderService;
import com.example.solicitude.utils.SzpJsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-26 23:53
 * @Description: SualLabel, Write down some description!!!
 */
@RestController
public class ElderController {
    @Autowired
    private ElderService elderService;
    @ApiOperation("增加Elder")
    @PostMapping("/insertElder.action")
    public SzpJsonResult insertElder(@RequestBody Elder elder){
        elderService.insertElder(elder);
        return SzpJsonResult.ok();
    }
    @ApiOperation("通过主键id删除Elder")
    @DeleteMapping("/deleteElderById.action")
    public SzpJsonResult deleteElderById(@RequestBody long id){
        elderService.deleteElderById(id);
        return SzpJsonResult.ok();
    }
    //根据主键跟新，值不为null的字段
    @ApiOperation("根据主键跟新，值不为null的字段")
    @PutMapping("/updateElderByUserId.action")
    public SzpJsonResult updateElderByUserId(@RequestBody Elder elder){
        Elder elderById = elderService.findElderById(elder.getId());
        elder.setUserId(elderById.getUserId());
        elderService.updateElderByUserId(elder);
        return SzpJsonResult.ok();
    }
    //通过id查找Elder，返回Elder
    @ApiOperation("通过id查找Elder，返回Elder")
    @GetMapping("/findElderById.action")
    public SzpJsonResult findElderById(long id){
        Elder elderById = elderService.findElderById(id);
        return SzpJsonResult.ok(elderById);
    }
    //通过userId查找Elder，返回list
    @ApiOperation("通过userId查找Elder，返回list")
    @GetMapping("/findElderByUserId.action")
    public SzpJsonResult findElderByUserId(long userId){
        Elder elderById = elderService.findElderById(userId);
        return SzpJsonResult.ok(elderById);
    }
    //通过姓名查找Elder，返回list
    @ApiOperation("通过姓名查找Elder，返回list")
    @GetMapping("/findElderByGivenName.action")
    public SzpJsonResult findElderByGivenName(String givenName){
        List<Elder> elderByGivenName = elderService.findElderByGivenName(givenName);
        return SzpJsonResult.ok(elderByGivenName);
    }
    //通过所在机构查找Elder，返回list
    @ApiOperation("通过所在机构查找Elder，返回list")
    @GetMapping("/findElderByCompany.action")
    public SzpJsonResult findElderByCompany(String company){
        List<Elder> elderByCompany = elderService.findElderByCompany(company);
        return SzpJsonResult.ok(elderByCompany);
    }
    @ApiOperation("显示所有Elder")
    @GetMapping("/findAllElder.action")
    public SzpJsonResult findAllElder(){
        List<Elder> allElder = elderService.findAllElder();
        return SzpJsonResult.ok(allElder);
    }
}
