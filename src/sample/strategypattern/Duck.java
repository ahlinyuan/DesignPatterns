package sample.strategypattern;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public Duck(){}

    public abstract void display();

    /**
     * 叫
     */
    public void performQuack(){
        quackBehavior.quack();//委托行为类实现
    }

    /**
     * 飞
     */
    public void performFly(){
        flyBehavior.fly();//委托行为类实现
    }

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
