package sample.strategypattern;

/**
 * 封装用飞行器飞行的行为类
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyRocketPowered");
    }
}
