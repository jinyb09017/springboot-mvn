package com.xingze.demo.model.result;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class ResponseResult<T>  implements Serializable {
    private static final long serialVersionUID = 2516884394320490733L;

    // 必选：标记接口是否成功，非 SUCCESS 都视为失败
    @Getter
    private String status;

    // 可选：status 为非 SUCCESS 时显示报错 UI 会使用该字段
    @Getter
    @Setter
    private String message;

    // 必选：实际数据，会将 data 下的所有字段挂载在对应的 bindingData 上
    @Getter
    @Setter
    private ResponseData<T> data;

    public void setStatus(boolean success){
        if (success){
            this.status="SUCCESS";
        } else {
            this.status="FAILED";
        }
    }


}
