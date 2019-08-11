package com.xingze.demo.starter.controller;

import com.xingze.demo.model.RequestDimension;
import com.xingze.demo.model.RequestReport;
import com.xingze.demo.starter.util.ResponseHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jinyb on 2019/8/11.
 * jyb@sina.com
 */
@RestController
@RequestMapping("/umbrella")
@Slf4j
public class UmbrellaController {

    @RequestMapping(value = "/dimension//list", method = RequestMethod.POST)
    public String getDimension(@RequestBody RequestDimension requestDimension) {
        log.info(requestDimension.toString());
        return ResponseHelper.response(2000, "data", "good", "request", requestDimension);
    }


    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public String getReport(@RequestBody RequestReport requestReport) {
        log.info(requestReport.toString());
        return ResponseHelper.response(2000, "data", "good", "request", requestReport);
    }
}
