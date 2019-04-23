package com.example.solicitude.service;

import com.example.solicitude.mapper.TrendMapper;
import com.example.solicitude.pojo.Trend;
import com.example.solicitude.pojo.TrendExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-26 23:24
 * @Description: SualLabel, Write down some description!!!
 */
@Service
@Transactional
public class TrendServiceImpl implements TrendService {
    @Autowired
    private TrendMapper trendMapper;
    @Override
    public void insertTrend(Trend trend) {
        trendMapper.insert(trend);
    }

    @Override
    public void deleteTrendById(long id) {
        trendMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateTrendById(Trend trend) {
        trendMapper.updateByPrimaryKeySelective(trend);
    }

    @Override
    public Trend findTrendById(long id) {
        Trend trend = trendMapper.selectByPrimaryKey(id);
        return trend;
    }

    @Override
    public List<Trend> findTrendByActiveId(String activeId) {
        TrendExample trendExample=new TrendExample();
        trendExample.createCriteria()
                .andActiveIdEqualTo(activeId);
        List<Trend> trends = trendMapper.selectByExample(trendExample);
        return trends;
    }

    @Override
    public List<Trend> findTrendByUserId(long userId) {
        TrendExample trendExample=new TrendExample();
        trendExample.createCriteria()
                .andUserIdEqualTo(userId);
        List<Trend> trends = trendMapper.selectByExample(trendExample);
        return trends;
    }

    @Override
    public List<Trend> findAllTrend() {
        TrendExample trendExample=new TrendExample();
        trendExample.createCriteria()
                .getAllCriteria();
        List<Trend> trends = trendMapper.selectByExample(trendExample);
        return trends;
    }
}
