package com.xingze.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Created by jinyb on 2019/8/11.
 * jyb@sina.com
 */
@Getter
@Setter
@ToString
public class RequestReport {
    private int  reportId;
    private long  startTime;
    private long  endTime;
    private List<Metric> metrics;
    private List<Dimension> dimensions;
    private String timeUnit;//DAYS 默认  HOURS, MINUTES
}
