package com.xingze.demo.serviceImpl;

import com.xingze.demo.model.Dimension;
import com.xingze.demo.model.Log;
import com.xingze.demo.service.LogService;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jinyb on 2019/8/10.
 * jyb@sina.com
 */
@Service(value = "LogServiceSql")
public class LogServiceSql implements LogService{


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

    public List<Log> getLogsByUtId(String utid, String appId, String ds, String  bizCode) {
        List<Log> logs = new ArrayList<Log>();
        for (int i = 0; i < 4; i++) {
            Log log = new Log();
            log.setUtid(String.format("utid%s", new Random().nextInt(10)));
            log.setErrorMsg(String.format("there is a error in line %s", i));
            log.setPoint("sql");
            logs.add(log);
        }
        return logs;
    }

    public List<Log> getLogsByDimension(String appId, long startTime, long endTime, List<Dimension> dimensions) {
        return null;
    }
}
