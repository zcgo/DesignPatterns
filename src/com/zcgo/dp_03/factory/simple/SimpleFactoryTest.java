package com.zcgo.dp_03.factory.simple;

/**
 * 简单工厂，单例本质上就是一个静态工厂
 * @author zc
 * @version V1.0
 * @date 2020/4/29 22:31
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Moveable moveable = SimpleFactory.createMoveable("1");
        moveable.go();
    }
}
