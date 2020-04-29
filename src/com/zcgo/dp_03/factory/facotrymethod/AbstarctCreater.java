package com.zcgo.dp_03.factory.facotrymethod;

/**
 * @author zc
 * @version V1.0
 * @date 2020/4/29 22:38
 */
public abstract class AbstarctCreater {
    abstract IProduct creatProduct();

    IProduct getProduct(){
        return creatProduct();
    }
}
