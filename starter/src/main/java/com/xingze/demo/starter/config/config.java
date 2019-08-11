package com.xingze.demo.starter.config;

import com.xingze.demo.model.Project;
import com.xingze.demo.starter.controller.LogController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jinyb on 2019/8/10.
 * jyb@sina.com
 */
@Configuration
public class config {
    private final static Logger logger = LoggerFactory.getLogger(config.class);

    public config() {
        logger.info("TestConfiguration容器启动初始化。。。");
    }
    @Bean
    public Project mytest(){
        Project project = new Project();
        project.name = "mutil";
        project.version = "1.0";
        return project;
    }
}
