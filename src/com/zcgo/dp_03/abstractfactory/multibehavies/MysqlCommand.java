package com.zcgo.dp_03.abstractfactory.multibehavies;

/**
 * @author zc
 * @version V1.0
 * @date 2020/4/29 22:55
 */
public class MysqlCommand implements ICommand{
    @Override
    public void command() {
        System.out.println("Mysql command...");
    }
}
