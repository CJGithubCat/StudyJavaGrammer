package com.my.study.netty;

import java.lang.reflect.InvocationTargetException;

/**
 *<p> Title: ReflectiveFactory </p>
 *<p> Description: 使用反射的方法创建实例的工厂；
 *<p> Copyright: openlo.cn Copyright (C) 2018 </p>
 *
 * @author HP
 * @version
 * @since 2018年9月20日
 */
public class ReflectiveFactory<T extends SuperClass> {
    private Class<? extends T> clazz;
    
    public ReflectiveFactory(Class<? extends T> clzz){
        this.clazz = clzz;
    }

    public T getInstance() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
        return this.clazz.getConstructor().newInstance();
    }
}
