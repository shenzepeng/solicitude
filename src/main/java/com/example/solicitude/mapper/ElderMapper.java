package com.example.solicitude.mapper;

import com.example.solicitude.pojo.Elder;
import com.example.solicitude.pojo.ElderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ElderMapper {
    int countByExample(ElderExample example);

    int deleteByExample(ElderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Elder record);

    int insertSelective(Elder record);

    List<Elder> selectByExample(ElderExample example);

    Elder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Elder record, @Param("example") ElderExample example);

    int updateByExample(@Param("record") Elder record, @Param("example") ElderExample example);

    int updateByPrimaryKeySelective(Elder record);

    int updateByPrimaryKey(Elder record);
}