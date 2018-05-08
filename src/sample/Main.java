package sample;

import sample.strategypattern.*;

public class Main {
    public static void main(String ares[]){

        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
