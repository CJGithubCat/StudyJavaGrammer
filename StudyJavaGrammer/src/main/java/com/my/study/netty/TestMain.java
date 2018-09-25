package com.my.study.netty;

import java.lang.reflect.InvocationTargetException;

/**
 *<p> Title: TestMain </p>
 *<p> Description: </p>
 *<p> Copyright: openlo.cn Copyright (C) 2018 </p>
 *
 * @author HP
 * @version
 * @since 2018年9月20日
 */
public class TestMain {

    public static void main(String[] args) {
        ReflectiveFactory<SonClass> reflectiveFactory = new ReflectiveFactory<>(SonClass.class);
        
        try {
            SonClass sonClass = reflectiveFactory.getInstance();
            sonClass.hello();
        }
        catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }
    }
}
