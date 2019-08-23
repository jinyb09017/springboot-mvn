package com.xingze.demo.starter.controller;


import com.xingze.demo.model.DimensionVo;
import com.xingze.demo.model.result.ResponseHelper;
import com.xingze.demo.model.result.ResponseResult;
import com.xingze.demo.serviceImpl.DimensionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jinyb on 2019/8/10.
 * jyb@sina.com
 */

@RestController
@RequestMapping("/newconfig/dimension")
public class DimensionController {
    private final static Logger logger = LoggerFactory.getLogger(DimensionController.class);


    @Autowired
    private DimensionService dimensionService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseResult<DimensionVo> businessList(@RequestParam int bizId) {

        return ResponseHelper.makeSuccessResponse(dimensionService.getDimensionsByBizId(bizId));
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseResult<Integer> addDimension(@RequestBody DimensionVo DimensionVo) {
        return ResponseHelper.makeSuccessResponseObject(dimensionService.addDimension(DimensionVo) );
    }

    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public ResponseResult<Integer> delBusiness(@RequestParam int id) {
        return ResponseHelper.makeSuccessResponseObject(dimensionService.delDimension(id) );
    }
}
