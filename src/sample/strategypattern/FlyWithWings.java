package sample.strategypattern;

/**
 * 封装用翅膀飞的行为类
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly With Wings 翅膀飞");
    }
}
