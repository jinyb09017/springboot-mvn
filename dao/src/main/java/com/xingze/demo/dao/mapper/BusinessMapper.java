package com.xingze.demo.dao.mapper;

import com.xingze.demo.model.BusinessVo;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface BusinessMapper {

    @Select("select * from umbrella_business")
    List<BusinessVo> getAllBusiness();

    @Select("select * from umbrella_business where id = #{id}")
    BusinessVo getBusinessById(int id);


    @Options(useGeneratedKeys = true, keyProperty = "id")//如何使用主键
    @Insert("INSERT INTO umbrella_business (biz_name, app_id, meta_id,report_id,point,os,midware) " +
            "VALUES (#{bizName}, #{appId}, #{metaId}, #{reportId}, #{point}, #{os}, #{midware})")
    int addBusiness(BusinessVo businessVo);

    @Delete("delete from umbrella_business where id = #{id} ")
    int delBusiness(int id) ;

    @Update("UPDATE umbrella_business SET biz_name=#{bizName}, app_id=#{appId}, " +
            "meta_id=#{metaId},report_id=#{reportId},point=#{point},os=#{os},midware=#{midware} where id=#{id}")
    int updateBusiness(BusinessVo businessVo);
}
