package com.xingze.demo.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by jinyb on 2019/8/11.
 * jyb@sina.com
 */
@Mapper
public interface CityMapper {

    @Select("select * from city where id = #{id}")
    City getById(int id);
}


