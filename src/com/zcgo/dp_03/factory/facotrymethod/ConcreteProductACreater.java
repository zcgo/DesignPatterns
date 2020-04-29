package com.zcgo.dp_03.factory.facotrymethod;

/**
 * 具体工厂方法，用于生产ProductA
 * @author zc
 * @version V1.0
 * @date 2020/4/29 22:40
 */
public class ConcreteProductACreater extends AbstarctCreater{
    @Override
    IProduct creatProduct() {
        return new ProductA();
    }
}
