package com.zcgo.dp_02.strategy;

import java.util.Arrays;

/**
 * @author zc
 * @version V1.0
 * @date 2020/4/29 21:35
 */
public class ComparatorStrategyTest {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{new Dog(2), new Dog(1), new Dog(3)};
        //这只是一种策略，根据食量比较
        Arrays.sort(dogs, (t1, t2)-> {
            int intake1 = t1.getIntake();
            int intake2 = t2.getIntake();
            return Integer.compare(intake1, intake2);
        });
        System.out.println(Arrays.toString(dogs));
    }
}
