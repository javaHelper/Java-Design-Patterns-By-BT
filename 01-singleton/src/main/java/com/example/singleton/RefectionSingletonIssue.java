package com.example.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class RefectionSingletonIssue {
    public static void main(String[] args) {
        DateUtil dateUtil1 = DateUtil.getInstance();
        DateUtil dateUtil2 = null;

        Constructor<?>[] declaredConstructors = DateUtil.class.getDeclaredConstructors();
        for (Constructor constructor: declaredConstructors) {
            constructor.setAccessible(true);
            try {
                dateUtil2 = (DateUtil) constructor.newInstance();
                break;
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        System.out.println(dateUtil1.hashCode());
        System.out.println(dateUtil2.hashCode());
    }
}