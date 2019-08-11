package com.xingze.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by jinyb on 2019/8/10.
 * jyb@sina.com
 */

@Setter
@Getter
@ToString
public class Log {

    private int line;
    private String errorMsg;
    private String utid;
    private String version;
    private String appId;
    private String point;
    private String sceneName;


}
