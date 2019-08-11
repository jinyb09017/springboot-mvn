package com.xingze.demo.starter.controller;

import com.xingze.demo.model.Log;
import com.xingze.demo.model.Project;
import com.xingze.demo.service.LogService;
import com.xingze.demo.starter.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jinyb on 2019/8/10.
 * jyb@sina.com
 */

@RestController
public class LogController {
    private final static Logger logger = LoggerFactory.getLogger(LogController.class);


    @Autowired
    private LogService logService;

    @Autowired
    private Project project;

    @RequestMapping("/log")
    public List<Log> greeting(@RequestParam(value="name", defaultValue="World") String name) {
        logger.error(project.toString());
        logger.debug("记录debug日志");
        logger.info("访问了info方法2");
        logger.warn("访问了warn方法");
        logger.error("记录了error错误日志");
        return logService.getLogs();
    }
}
