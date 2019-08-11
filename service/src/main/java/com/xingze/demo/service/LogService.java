package com.xingze.demo.service;

import com.xingze.demo.model.Log;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinyb on 2019/8/10.
 * jyb@sina.com
 */
@Service
public class LogService {


    public List<Log> getLogs() {
        List<Log> logs = new ArrayList<Log>();
        for (int i = 0; i < 2; i++) {
            Log log = new Log();
            log.setLine(i + 1);
            log.setErrorMsg(String.format("there is a error in line %s", i));
            logs.add(log);
        }
        return logs;
    }
}
