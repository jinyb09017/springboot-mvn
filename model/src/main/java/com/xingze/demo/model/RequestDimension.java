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
public class RequestDimension {

    private int  reportId;
    private int  limit;
    private long  startTime;
    private long  endTime;
    private List<Dimension> dimensions;

}
