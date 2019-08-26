package com.xingze.demo.serviceImpl;

import com.xingze.demo.dao.mapper.BusinessMapper;
import com.xingze.demo.dao.mapper.CityMapper;
import com.xingze.demo.model.BusinessVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessService {
    @Autowired
    private BusinessMapper businessMapper;


    public List<BusinessVo> getAllBusiness() {
        return businessMapper.getAllBusiness();
    }

    public int addBusiness(BusinessVo businessVo) {
        return businessMapper.addBusiness(businessVo);
    }

    public BusinessVo getBusinessById(int id) {
        return businessMapper.getBusinessById(id);
    }

    public int delBusiness(int id) {
        return businessMapper.delBusiness(id);
    }


    public int updateBusiness(BusinessVo businessVo) {
        return businessMapper.updateBusiness(businessVo);
    }
}
