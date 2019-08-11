package com.xingze.demo.starter.controller;


import com.xingze.demo.dao.mapper.CityMapper;
import com.xingze.demo.model.Log;
import com.xingze.demo.model.RequestUtid;
import com.xingze.demo.service.LogService;
import com.xingze.demo.serviceImpl.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jinyb on 2019/8/10.
 * jyb@sina.com
 */

@RestController
public class LogController {
    private final static Logger logger = LoggerFactory.getLogger(LogController.class);


    @Autowired @Qualifier("LogServiceEs")
    private LogService logService;


    @Autowired
    private CityService cityService;


    @RequestMapping(value = "/log", method = RequestMethod.POST)
    public List<Log> logList(@RequestBody RequestUtid requestUtid) {
        logger.error(requestUtid.toString());
        logger.error(cityService.getById(1).toString());
        logger.debug("记录debug日志");
        logger.info("访问了info方法3");
        logger.warn("访问了warn方法");
        logger.error("记录了error错误日志");
        return logService.getLogsByUtId(requestUtid.getUtid(),
                requestUtid.getApp_id(),
                requestUtid.getDs(),
                requestUtid.getBiz_code());
    }
}
