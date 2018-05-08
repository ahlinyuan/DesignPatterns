package sample.strategypattern;

/**
 * 封装吱吱叫的行为类
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak 吱吱");
    }
}
