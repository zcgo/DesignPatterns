package com.zcgo.dp_03.factory.simple;

/**
 * @author zc
 * @version V1.0
 * @date 2020/4/29 22:27
 */
public class SimpleFactory {

    public static Moveable createMoveable(String type){
        Moveable moveable = null;
        switch (type){
            case "0":
                moveable = new Car();
                break;
            case "1":
                moveable = new Plane();
                break;
            default:
                break;
        }
        return moveable;
    }
}
