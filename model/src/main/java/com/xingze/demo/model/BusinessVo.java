package com.xingze.demo.model;

import com.xingze.demo.model.validata.NotEmpty;
import com.xingze.demo.model.validata.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BusinessVo {

    private int id;
    @NotNull @NotEmpty
    private String bizName;

    @NotNull @NotEmpty
    private String appId;

    @NotNull(name = "配置Id")
    private long metaId;

    @NotNull("报表Id")
    private long reportId;

    @NotNull @NotEmpty
    private String point;

    @NotNull @NotEmpty
    private String os;//android ios;
    private boolean midware;//是否中间件
    private String desc;
}
