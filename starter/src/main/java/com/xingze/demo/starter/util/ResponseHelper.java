package com.xingze.demo.starter.util;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jinyb on 2019/8/11.
 * jyb@sina.com
 */
public class ResponseHelper {

    public static String response(int code, Object ...args) {
        Map<String,Object> paras = new HashMap<String,Object>();
        paras.put("code",code);
        if (args.length <=  0 || args.length %2 != 0) {
            throw new IllegalArgumentException("参数数目不合法");
        }
        for (int i = 0; i < args.length; i=i+2) {
            paras.put((String) args[i],args[i+1]);
        }
        return new Gson().toJson(paras);

    }
}
