package com.zcgo.dp_03.abstractfactory.multibehavies;

/**
 * @author zc
 * @version V1.0
 * @date 2020/4/29 22:56
 */
public class OracleConnection implements IConnection{
    @Override
    public void connect() {
        System.out.println("Oracle connect...");
    }
}
