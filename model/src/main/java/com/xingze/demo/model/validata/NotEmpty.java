package com.xingze.demo.model.validata;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义属性非空校验注解
 * @Author: wwh
 * @Date: 2019/1/16 15:19:10
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotEmpty {

    /**
     * 获取参数名
     * @return
     */
    String name() default "";

    String value() default "";
}
