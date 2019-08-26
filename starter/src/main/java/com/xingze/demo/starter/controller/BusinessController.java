package com.xingze.demo.starter.controller;


import com.xingze.demo.model.*;
import com.xingze.demo.model.result.ResponseHelper;
import com.xingze.demo.model.result.ResponseResult;
import com.xingze.demo.model.validata.NullValidation;
import com.xingze.demo.model.validata.Validate;
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
        if (Validate.validate(businessVo) != null) {
            return ResponseHelper.makeErrorResponse(Validate.validate(businessVo) );
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

    /**
     * 更新business
     *
     * @param businessVo
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseResult<Integer> updateBusiness(@RequestBody BusinessVo businessVo) {
        if (Validate.validate(businessVo) != null) {
            return ResponseHelper.makeErrorResponse(Validate.validate(businessVo) );
        }
        return ResponseHelper.makeSuccessResponseObject(businessService.updateBusiness(businessVo));
    }

    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public ResponseResult<Integer> delBusiness(@RequestParam int id) {
        return ResponseHelper.makeSuccessResponseObject(businessService.delBusiness(id));
    }


    public List<DimensionVo> getDefaultDims(int bizId) {
        List<DimensionVo> dims = new ArrayList<DimensionVo>();
        DimensionVo dim1 = new DimensionVo();
        dim1.setBizId(bizId);
        dim1.setDimName("appVersion");
        dim1.setDimDesc("版本");
        dim1.setFix(true);
        dims.add(dim1);

        DimensionVo dim2 = new DimensionVo();
        dim2.setBizId(bizId);
        dim2.setDimName("serviceId");
        dim2.setDimDesc("服务");
        dim2.setFix(true);
        dims.add(dim2);

        DimensionVo dim3 = new DimensionVo();
        dim3.setBizId(bizId);
        dim3.setDimName("sceneName");
        dim3.setDimDesc("场景");
        dim3.setFix(true);
        dims.add(dim3);

        DimensionVo dim4 = new DimensionVo();
        dim4.setBizId(bizId);
        dim4.setDimName("featureType");
        dim4.setDimDesc("功能");
        dim4.setFix(true);
        dims.add(dim4);

        DimensionVo dim5 = new DimensionVo();
        dim5.setBizId(bizId);
        dim5.setDimName("errorCode");
        dim5.setDimDesc("错误码");
        dim5.setFix(true);
        dims.add(dim5);
        return dims;
    }
}
