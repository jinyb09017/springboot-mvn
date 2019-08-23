package com.xingze.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BusinessVo {
    private int id;
    private String biz_name;
    private String app_id;
    private long meta_id;
    private long report_id;
    private String point;
    private String os;//android ios;
    private boolean midware;//是否中间件
    private String desc;
}
