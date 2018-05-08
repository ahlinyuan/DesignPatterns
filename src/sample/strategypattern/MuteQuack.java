package sample.strategypattern;

/**
 * 封装嘎嘎叫的行为类
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("MuteQuack 嘎嘎");
    }
}
