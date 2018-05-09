package sample.observerpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * java内置观察者实现 观察者
 */
public class CurrentConditionsDisplay implements Observer {

    Observable observable;
    float temperature, humidity, pressure;

    public CurrentConditionsDisplay(Observable o){
        observable = o;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData wd = (WeatherData)o;
        this.temperature = wd.getTemperature();
        this.humidity = wd.getHumidity();
        this.pressure = wd.getPressure();
        display();
    }

    public void display() {
        System.out.println("temperature=" + temperature + ",humidity=" + humidity + ",pressure=" + pressure);
    }
}
