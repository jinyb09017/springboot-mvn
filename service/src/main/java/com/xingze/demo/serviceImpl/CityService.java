package com.xingze.demo.serviceImpl;
import com.xingze.demo.dao.mapper.City;
import com.xingze.demo.dao.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jinyb on 2019/8/11.
 * jyb@sina.com
 */
@Service
public class CityService {

    @Autowired
    //这个傻逼的提示可以不用关注。害我查了好久的原因。
    private CityMapper cityMapper;

    public City getById(int id){
       return cityMapper.getById(id);
    }

}
