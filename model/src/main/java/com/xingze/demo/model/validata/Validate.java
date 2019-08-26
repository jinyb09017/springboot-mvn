package com.xingze.demo.model.validata;

import com.sun.tools.corba.se.idl.constExpr.Not;

import java.util.ArrayList;
import java.util.List;

public class Validate {
    public static List<Validation> validationList = new ArrayList<>();

    static {
        validationList.add(new NullValidation());
        validationList.add(new EmptyValidation());
    }

    public static <T> String validate(T t) {
        for (Validation validation : validationList) {
            if (validation.validate(t) != null) {
                return validation.validate(t);
            }
        }
        return null;
    }
}
