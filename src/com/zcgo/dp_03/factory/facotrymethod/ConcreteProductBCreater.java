package com.zcgo.dp_03.factory.facotrymethod;

/**
 * 具体工厂方法，用于生产ProductB
 * @author zc
 * @version V1.0
 * @date 2020/4/29 22:41
 */
public class ConcreteProductBCreater extends AbstarctCreater{
    @Override
    IProduct creatProduct() {
        return new ProductB();
    }
}
