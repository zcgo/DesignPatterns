package com.zcgo.dp_03.factory.simple;

/**
 * @author zc
 * @version V1.0
 * @date 2020/4/29 22:19
 */
public class Car implements Moveable{
    @Override
    public void go() {
        System.out.println("Car go...");
    }
}
