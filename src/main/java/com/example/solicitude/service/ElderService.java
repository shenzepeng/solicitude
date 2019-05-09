package com.example.solicitude.service;

import com.example.solicitude.pojo.Elder;

import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-26 20:00
 * @Description: SualLabel, Write down some description!!!
 */
public interface ElderService {
    void insertElder(Elder elder);
    void deleteElderById(long id);
    void updateElderByUserId(Elder elder);
    //通过id查找Elder，返回Elder
    Elder findElderById(long id);
    //通过userId查找Elder，返回list
    List<Elder> findElderByUserId(long userId);
    //通过姓名查找Elder，返回list
    List<Elder> findElderByGivenName(String givenName);
    //通过所在机构查找Elder，返回list
    List<Elder> findElderByCompany(String company);
    //显示所有Elder
    List<Elder> findAllElder();

    List<Elder> findElderByUserIdAndCompany(Long userId,String company);
}
