package com.xingze.demo.service;

import com.xingze.demo.model.Dimension;
import com.xingze.demo.model.Log;

import java.util.List;

/**
 * Created by jinyb on 2019/8/11.
 * jyb@sina.com
 */
public interface LogService {


    /**
     * 根据utid来查询
     * @param utid
     * @return
     */
    List<Log> getLogsByUtId(String utid, String appId, String ds, String  bizCode);

    /**
     * 支持多个维度进行查询
     * @param appId
     * @param startTime
     * @param endTime
     * @param dimensions
     * @return
     */
    List<Log> getLogsByDimension(String appId, long startTime, long endTime, List<Dimension> dimensions);
}
