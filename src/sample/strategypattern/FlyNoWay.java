package sample.strategypattern;

/**
 * 封装不会飞的行为类
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
