package com.example.solicitude.service;

import com.example.solicitude.mapper.ElderMapper;
import com.example.solicitude.pojo.Elder;
import com.example.solicitude.pojo.ElderExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: SualLabel
 * @Date: 2019-02-26 20:11
 * @Description: SualLabel, Write down some description!!!
 */
@Service
public class ElderServiceImpl implements ElderService {
    @Autowired
    private ElderMapper elderMapper;
    @Override
    public void insertElder(Elder elder) {
        elderMapper.insert(elder);
    }

    @Override
    public void deleteElderById(long id) {
        elderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateElderByUserId(Elder elder) {
        elderMapper.updateByPrimaryKeySelective(elder);
    }

    @Override
    public Elder findElderById(long id) {
        Elder elder = elderMapper.selectByPrimaryKey(id);
        return elder;
    }

    @Override
    public List<Elder> findElderByUserId(long userId) {
        ElderExample elderExample=new ElderExample();
        elderExample.createCriteria()
                .andUserIdEqualTo(userId);
        List<Elder> elders = elderMapper.selectByExample(elderExample);
        return elders;
    }

    @Override
    public List<Elder> findElderByGivenName(String givenName) {
        ElderExample elderExample=new ElderExample();
        elderExample.createCriteria()
                .andGivenNameEqualTo(givenName);
        List<Elder> elders = elderMapper.selectByExample(elderExample);
        return elders;
    }

    @Override
    public List<Elder> findElderByCompany(String company) {
        ElderExample elderExample=new ElderExample();
        elderExample.createCriteria()
                .andCompanyEqualTo(company);
        List<Elder> elders = elderMapper.selectByExample(elderExample);
        return elders;
    }

    @Override
    public List<Elder> findAllElder() {
        ElderExample elderExample=new ElderExample();
        elderExample.createCriteria()
                .getAllCriteria();
        List<Elder> elders = elderMapper.selectByExample(elderExample);
        return elders;
    }
}
