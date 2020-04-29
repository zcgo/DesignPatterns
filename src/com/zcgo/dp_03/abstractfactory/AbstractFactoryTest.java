package com.zcgo.dp_03.abstractfactory;

import com.zcgo.dp_03.abstractfactory.factory.AbstractDatabase;
import com.zcgo.dp_03.abstractfactory.factory.MysqlDatabase;

/**
 * 抽象工厂，适合这种多行为的扩展，且保证兼容
 * @author zc
 * @version V1.0
 * @date 2020/4/29 21:51
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractDatabase database = new MysqlDatabase();
        database.getConnection().connect();
        database.getCommand().command();
    }
}
