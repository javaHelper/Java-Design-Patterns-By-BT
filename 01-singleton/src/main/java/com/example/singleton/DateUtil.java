package com.example.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {
    // use volatile : To avoid any issues in multithreded env
    private static volatile DateUtil instance;

    private DateUtil() {
    }

    // synchronized will make sure only 1 thread will access at a time
    // Acquiring a lock a is very expensive process
    public static DateUtil getInstance() {
        // if instance is already created why should we lock the class again?
        if (instance == null) {
            synchronized (DateUtil.class) {
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }

    protected Object readResolve(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}