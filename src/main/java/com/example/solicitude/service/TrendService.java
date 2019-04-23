package com.example.solicitude.service;

import com.example.solicitude.pojo.Trend;

import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-26 20:13
 * @Description: SualLabel, Write down some description!!!
 */
public interface TrendService {
    void insertTrend(Trend trend);
    void deleteTrendById(long id);
    void updateTrendById(Trend trend);
    //通过id找到Trend
    Trend findTrendById(long id);
    //通过动态id找到Trend
    List<Trend> findTrendByActiveId(String activeId);
    //通过userId找到Trend
    List<Trend> findTrendByUserId(long userId);
    //显示所有Trend
    List<Trend> findAllTrend();
}
