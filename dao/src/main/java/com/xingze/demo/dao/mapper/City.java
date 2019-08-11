package com.xingze.demo.dao.mapper;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by jinyb on 2019/8/11.
 * jyb@sina.com
 */

@Setter
@Getter
@ToString
public class City {
    private int id;
    private String city_name;
    private int province_id;
    private String description;
}
