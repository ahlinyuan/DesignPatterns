package sample;

import sample.observerpattern.CurrentConditionsDisplay;
import sample.observerpattern.WeatherData;
import sample.strategypattern.*;

public class Main {
    public static void main(String ares[]){

        /* 策略模式 测试*/
//        Duck duck = new MallardDuck();
//        duck.performFly();
//        duck.performQuack();
//
//        Duck modelDuck = new ModelDuck();
//        modelDuck.performQuack();
//        modelDuck.performFly();
//        modelDuck.setFlyBehavior(new FlyRocketPowered());
//        modelDuck.performFly();


        /* 观察者模式 测试*/
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(5.2f, 3.6f, 65.2f);

        sample.observerpattern.observer.WeatherData wd = new sample.observerpattern.observer.WeatherData();
        sample.observerpattern.observer.CurrentConditionsDisplay currentConditionsDisplay = new sample.observerpattern.observer.CurrentConditionsDisplay(wd);
        wd.setMeasurements(50, 60, 98.5f);
    }
}
