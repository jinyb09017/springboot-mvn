package com.xingze.demo.model.result;

import java.util.ArrayList;
import java.util.List;

public class ResponseHelper {

    /**
     * 创建成功的数据结构
     * @param datas
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> makeSuccessResponse(List<T> datas){
        ResponseData responseData = new ResponseData();
        responseData.setDataSource(datas);
        responseData.setPage(1);
        ResponseResult<T> responseResult = new ResponseResult();
        responseResult.setData(responseData);
        responseResult.setStatus(true);
        return responseResult;
    }

    public static <T> ResponseResult<T> makeSuccessResponseObject(T t){
        List<T> datas = new ArrayList<T>();
        datas.add(t);
        ResponseData<T> responseData = new ResponseData();
        responseData.setDataSource(datas);
        responseData.setPage(1);
        ResponseResult<T> responseResult = new ResponseResult();
        responseResult.setData(responseData);
        responseResult.setStatus(true);
        return responseResult;
    }

    /**
     * 创建成功的数据结构
     * @param datas
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> makeSuccessResponse(List<T> datas, int page){
        ResponseData<T> responseData = new ResponseData();
        responseData.setDataSource(datas);
        responseData.setPage(page);
        ResponseResult<T> responseResult = new ResponseResult();
        responseResult.setData(responseData);
        responseResult.setStatus(true);
        return responseResult;
    }

    /**
     * 创建失败的数据结构
     * @param <T>
     * @return
     */
    public static <T> ResponseResult<T> makeErrorResponse(String msg){
        ResponseData<T> responseData = new ResponseData();
        ResponseResult<T> responseResult = new ResponseResult();
        responseResult.setData(responseData);
        responseResult.setStatus(false);
        responseResult.setMessage(msg);
        return responseResult;
    }
}
