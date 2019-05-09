package com.example.solicitude.controller;

import com.example.solicitude.pojo.Trend;
import com.example.solicitude.service.TrendService;
import com.example.solicitude.utils.SzpJsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-26 23:59
 * @Description: SualLabel, Write down some description!!!
 */
@RestController
public class TrendController {
    @Autowired
    private TrendService trendService;
    @ApiOperation("添加Trend")
    @PostMapping("/insertTrend.action")
    public SzpJsonResult insertTrend(@RequestBody Trend trend){
        trendService.insertTrend(trend);
        return SzpJsonResult.ok();
    }
    @ApiOperation("通过主键id删除trend")
    @DeleteMapping("/deleteTrendById.action")
    public SzpJsonResult deleteTrendById(@RequestBody long id){
        trendService.deleteTrendById(id);
        return SzpJsonResult.ok();
    }
    //根据主键跟新，值不为null的字段
    @ApiOperation("根据主键跟新，值不为null的字段")
    @PutMapping("/updateTrendById.action")
    public SzpJsonResult updateTrendById(@RequestBody Trend trend){
        Trend trendById = trendService.findTrendById(trend.getId());
        trend.setUserId(trendById.getUserId());
        trendService.updateTrendById(trend);
        return SzpJsonResult.ok();
    }
    //通过id找到Trend
    @ApiOperation("通过id找到Trend")
    @GetMapping("/findTrendById.action")
    public SzpJsonResult findTrendById(long id){
        Trend trendById = trendService.findTrendById(id);
        return SzpJsonResult.ok(trendById);
    }
    //通过动态id找到Trend
    @ApiOperation("通过动态id找到Trend")
    @GetMapping("/findTrendByActiveId.action")
    public SzpJsonResult findTrendByActiveId(String activeId){
        List<Trend> trendByActiveId = trendService.findTrendByActiveId(activeId);
        return SzpJsonResult.ok(trendByActiveId);
    }
    //通过userId找到Trend
    @ApiOperation("通过userId找到Trend")
    @GetMapping("/findTrendByUserId.action")
    public SzpJsonResult findTrendByUserId(long userId){
        List<Trend> trendByUserId = trendService.findTrendByUserId(userId);
        return SzpJsonResult.ok(trendByUserId);
    }
    @ApiOperation("通过老人的主键id找到Trend，表中的blanckSpaceOne存这个")
    @GetMapping("/findTrendByElderId.action")
    public SzpJsonResult findTrendByElderId(String elderId){
        List<Trend> trendByElderId = trendService.findTrendByElderId(elderId);
        return SzpJsonResult.ok(trendByElderId);
    }
}
