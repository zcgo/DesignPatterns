package com.zcgo.dp_02.strategy;

/**
 * @author zc
 * @version V1.0
 * @date 2020/4/29 21:36
 */
public class Dog {
    private int intake;

    public Dog(int intake) {
        this.intake = intake;
    }

    public int getIntake() {
        return intake;
    }

    public void setIntake(int intake) {
        this.intake = intake;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "intake=" + intake +
                '}';
    }
}
