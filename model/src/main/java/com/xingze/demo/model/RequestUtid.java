package com.xingze.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by jinyb on 2019/8/11.
 * jyb@sina.com
 */

@Setter
@Getter
@ToString
public class RequestUtid {

    private String ds;
    private String app_id;
    private String biz_code;
    private String utid;
}
