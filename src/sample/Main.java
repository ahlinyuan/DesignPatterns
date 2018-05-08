package sample;

import sample.strategypattern.Duck;
import sample.strategypattern.FlyWithWings;
import sample.strategypattern.MallardDuck;

public class Main {
    public static void main(String ares[]){

        Duck duck = new MallardDuck();
        duck.setFlyBehavior(new FlyWithWings());
        duck.performFly();
        duck.performQuack();
    }
}
