package com.zcgo.dp_01.singleton;

/**
 * 饿汉式方式二：双层检查同步代码块
 * 原理：本质上是利用同步代码块来消除线程安全问题，利用volatile关键字来消除JIT,CPU指令重排问题
 * @author zc
 * @version V1.0
 * @date 2020/4/29 21:08
 */
public class Singleton03MulcheckSyn {
    private static volatile Singleton03MulcheckSyn instance;
    private Singleton03MulcheckSyn(){}

    public static Singleton03MulcheckSyn getInstance(){
        if(instance == null){
            synchronized (Singleton03MulcheckSyn.class){
                if(instance == null){
                    instance = new Singleton03MulcheckSyn();
                }
            }
        }
        return instance;
    }
}
