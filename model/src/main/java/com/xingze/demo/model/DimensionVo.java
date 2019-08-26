package com.xingze.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class DimensionVo {
    private String dimName;
    private String dimDesc;
    private boolean fix;//是否必选
    private int bizId;//业务id
    private int id;//惟一标识
}
