package com.zcgo.dp_03.abstractfactory.factory;

import com.zcgo.dp_03.abstractfactory.multibehavies.ICommand;
import com.zcgo.dp_03.abstractfactory.multibehavies.IConnection;

/**
 * 定义抽象的数据库
 * @author zc
 * @version V1.0
 * @date 2020/4/29 22:57
 */
public abstract class AbstractDatabase {
    public abstract IConnection getConnection();
    public abstract ICommand getCommand();
}
