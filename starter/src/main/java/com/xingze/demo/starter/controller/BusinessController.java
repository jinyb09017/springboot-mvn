package com.xingze.demo.starter.controller;


import com.xingze.demo.model.*;
import com.xingze.demo.model.result.ResponseHelper;
import com.xingze.demo.model.result.ResponseResult;
import com.xingze.demo.serviceImpl.BusinessService;
import com.xingze.demo.serviceImpl.DimensionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinyb on 2019/8/10.
 * jyb@sina.com
 */

@RestController
@RequestMapping("/newconfig/business")
public class BusinessController {
    private final static Logger logger = LoggerFactory.getLogger(BusinessController.class);


    @Autowired
    private BusinessService businessService;

    @Autowired
    private DimensionService dimensionService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseResult<BusinessVo> businessList() {

        return ResponseHelper.makeSuccessResponse(businessService.getAllBusiness());
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseResult<Integer> businessList(@RequestBody BusinessVo businessVo) {
        if (businessVo.getMeta_id() < 0 || businessVo.getReport_id() <= 0) {
            ResponseHelper.makeErrorResponse("reportId 或 metaId不能为空");
        }
        if (businessVo.getApp_id().isEmpty()) {
            ResponseHelper.makeErrorResponse("appId不能为空");
        }
        if (businessVo.getBiz_name().isEmpty()) {
            ResponseHelper.makeErrorResponse("bizName不能为空");
        }
        if (businessVo.getPoint().isEmpty()) {
            ResponseHelper.makeErrorResponse("point不能为空");
        }

        int ret = businessService.addBusiness(businessVo);
        if (ret > 0) {
            //添加默认业务
            List<DimensionVo> dims = getDefaultDims(businessVo.getId());
            for (DimensionVo dim : dims) {
                dimensionService.addDimension(dim);
            }
        }
        return ResponseHelper.makeSuccessResponseObject(ret);
    }

    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public ResponseResult<Integer> delBusiness(@RequestParam int id) {
        return ResponseHelper.makeSuccessResponseObject(businessService.delBusiness(id) );
    }


    public List<DimensionVo> getDefaultDims(int bizId) {
        List<DimensionVo> dims = new ArrayList<DimensionVo>();
        DimensionVo dim1 = new DimensionVo();
        dim1.setBiz_id(bizId);
        dim1.setDim_name("appVersion");
        dim1.setDim_desc("版本");
        dim1.setFix(true);
        dims.add(dim1);

        DimensionVo dim2 = new DimensionVo();
        dim2.setBiz_id(bizId);
        dim2.setDim_name("serviceId");
        dim2.setDim_desc("服务");
        dim2.setFix(true);
        dims.add(dim2);

        DimensionVo dim3 = new DimensionVo();
        dim3.setBiz_id(bizId);
        dim3.setDim_name("sceneName");
        dim3.setDim_desc("场景");
        dim3.setFix(true);
        dims.add(dim3);

        DimensionVo dim4 = new DimensionVo();
        dim4.setBiz_id(bizId);
        dim4.setDim_name("featureType");
        dim4.setDim_desc("功能");
        dim4.setFix(true);
        dims.add(dim4);

        DimensionVo dim5 = new DimensionVo();
        dim5.setBiz_id(bizId);
        dim5.setDim_name("errorCode");
        dim5.setDim_desc("错误码");
        dim5.setFix(true);
        dims.add(dim5);
        return dims;
    }
}
