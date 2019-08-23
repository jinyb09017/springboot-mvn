package com.xingze.demo.serviceImpl;

import com.xingze.demo.dao.mapper.DimensionMapper;
import com.xingze.demo.model.BusinessVo;
import com.xingze.demo.model.DimensionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DimensionService {
    @Autowired
    private DimensionMapper dimensionMapper;


    public List<DimensionVo> getAllDimensions() {
        return dimensionMapper.getAllDimensions();
    }

    public int addDimension(DimensionVo dimensionVo) {
        return dimensionMapper.addDimension(dimensionVo);
    }

    public List<DimensionVo> getDimensionsByBizId(int bizId) {
        return dimensionMapper.getDimensionById(bizId);
    }

    public int delDimension(int id) {
        return dimensionMapper.delDimension(id);
    }

}
