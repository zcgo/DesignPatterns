package com.zcgo.dp_03.factory.facotrymethod;

/**
 * 工厂方法便于扩展产品，如新增产品ProductC，就新增C的真实创建者
 * @author zc
 * @version V1.0
 * @date 2020/4/29 22:42
 */
public class FactoryMehtodTest {
    public static void main(String[] args) {
        AbstarctCreater creater = new ConcreteProductACreater();
        creater.getProduct().use();
    }
}
