package com.zcgo.dp_01.singleton;

/**
 * 天然不支持反射创建对应的实例，且有自己的反序列化机制
 * @author zc
 * @version V1.0
 * @date 2020/4/29 21:13
 */
public enum  Singleton04Enum {
    INSTANCE;

    public static Singleton04Enum getInstance(){
        return INSTANCE;
    }
}
