package sample.strategypattern;

/**
 * 封装叫的行为类
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack 嘎嘎");
    }
}
