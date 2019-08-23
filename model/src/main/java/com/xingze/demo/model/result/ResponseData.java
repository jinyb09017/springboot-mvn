package com.xingze.demo.model.result;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ResponseData<T> implements Serializable {
    private static final long serialVersionUID = 2516884394320490733L;

    private List<T> dataSource;

    private Integer page;
}
