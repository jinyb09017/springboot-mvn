package com.xingze.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class DimensionVo {
    private String dim_name;
    private String dim_desc;
    private boolean fix;//是否必选
    private int biz_id;//业务id
    private int id;//惟一标识
}
