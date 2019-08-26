package com.xingze.demo.model.validata;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 找到不能为空的对象
 */
public class NullValidation implements Validation{

    public  String validate(Object t) {
        List<ValidateResult> validateResults = new ArrayList<>();
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                field.setAccessible(true);
                Object value = null;
                try {
                    value = field.get(t);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (value == null) {
                    NotNull notNull = field.getAnnotation(NotNull.class);
                    ValidateResult validateResult = new ValidateResult();
                    if (notNull.name().isEmpty()){
                        validateResult.setMessage(field.getName() + "不能为空");
                    } else {
                        validateResult.setMessage(notNull.name() + "不能为空");
                    }

                    return validateResult.getMessage();
                }
            }

        }
        return null;
    }

}
