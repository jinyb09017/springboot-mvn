package com.xingze.demo.dao.mapper;

import com.xingze.demo.model.DimensionVo;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DimensionMapper {

    @Select("select * from umbrella_dimension")
    List<DimensionVo> getAllDimensions();

    @Select("select * from umbrella_dimension where bizId = #{id}")
    List<DimensionVo> getDimensionById(int id);

    @Options(useGeneratedKeys = true, keyProperty = "id")//如何使用主键
    //因为name和desc是关键字。所以要区分出来。不然会报错
    @Insert("INSERT INTO umbrella_dimension (dim_name,dim_desc,fix,biz_id) " +
            "VALUES (#{dim_name}, #{dim_desc}, #{fix}, #{biz_id})")
    int addDimension(DimensionVo dimensionVo);

    @Delete("delete from umbrella_dimension where id = #{id} ")
    int delDimension(int id);
}
