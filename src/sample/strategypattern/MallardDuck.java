package sample.strategypattern;

/**
 * 具体客户类（野鸭）
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("MallardDuck");
    }
}
