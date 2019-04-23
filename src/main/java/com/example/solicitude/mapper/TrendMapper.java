package com.example.solicitude.mapper;

import com.example.solicitude.pojo.Trend;
import com.example.solicitude.pojo.TrendExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TrendMapper {
    int countByExample(TrendExample example);

    int deleteByExample(TrendExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Trend record);

    int insertSelective(Trend record);

    List<Trend> selectByExample(TrendExample example);

    Trend selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Trend record, @Param("example") TrendExample example);

    int updateByExample(@Param("record") Trend record, @Param("example") TrendExample example);

    int updateByPrimaryKeySelective(Trend record);

    int updateByPrimaryKey(Trend record);
}