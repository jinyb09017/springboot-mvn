package com.xingze.demo.model.validata;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 找到不能为空的对象
 */
public class EmptyValidation implements Validation {

    @Override
    public String validate(Object t) {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(NotEmpty.class)) {
                field.setAccessible(true);
                Object value = null;
                try {
                    value = field.get(t);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (value != null && value.toString().isEmpty()) {
                    NotEmpty notNull = field.getAnnotation(NotEmpty.class);
                    ValidateResult validateResult = new ValidateResult();
                    if (notNull.name().isEmpty()){
                        validateResult.setMessage(field.getName() + "不能为空字符串");
                    } else {
                        validateResult.setMessage(notNull.name() + "不能为空字符串");
                    }

                    return validateResult.getMessage();
                }
            }

        }
        return null;
    }

//    @Override
//    public String validate(Object o) {
//        return null;
//    }
}
