package com.zcgo.dp_01.singleton;

/**
 * 饿汉式，最简单也最实用
 * 原理：类加载的初始化阶段就完成了实例的初始化，本质上借助于jvm的类加载机制，保证实例的唯一性及线程安全
 *  - 类的加载只会执行一次，初始化过程只会执行一次，即赋值只会一次
 *  - JVM以同步的形式来进行类加载过程
 * @author zc
 * @version V1.0
 * @date 2020/4/29 20:25
 */
public class Singleton01Hungry {
    private static Singleton01Hungry instance = new Singleton01Hungry();
    private Singleton01Hungry(){}

    public static Singleton01Hungry getInstance(){
        return instance;
    }
}
