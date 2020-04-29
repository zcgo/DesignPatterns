package com.zcgo.dp_03.abstractfactory.factory;

import com.zcgo.dp_03.abstractfactory.multibehavies.ICommand;
import com.zcgo.dp_03.abstractfactory.multibehavies.IConnection;
import com.zcgo.dp_03.abstractfactory.multibehavies.MysqlCommand;
import com.zcgo.dp_03.abstractfactory.multibehavies.MysqlConnection;

/**
 * 此时能够保证两种行为兼容
 * @author zc
 * @version V1.0
 * @date 2020/4/29 23:00
 */
public class MysqlDatabase extends AbstractDatabase{
    @Override
    public IConnection getConnection() {
        return new MysqlConnection();
    }

    @Override
    public ICommand getCommand() {
        return new MysqlCommand();
    }
}
