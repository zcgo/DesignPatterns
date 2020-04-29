package com.zcgo.dp_01.singleton;

/**
 * 懒汉式方式一：静态内部类
 * 原理：本质上是利用类的加载机制来保证线程安全
 * @author zc
 * @version V1.0
 * @date 2020/4/29 20:55
 */
public class Singleton02StaticClass {
    private Singleton02StaticClass(){
        //防止反射攻击
        if(InnerSingletonHolder.instance != null){
            throw new RuntimeException("单例对象不允许多个实例！");
        }
    }
    private static class InnerSingletonHolder{
        private static Singleton02StaticClass instance = new Singleton02StaticClass();
    }

    public static Singleton02StaticClass getInstance(){
        return InnerSingletonHolder.instance;
    }

}
