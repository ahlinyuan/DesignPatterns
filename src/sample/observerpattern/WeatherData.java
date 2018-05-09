package sample.observerpattern;

import java.util.ArrayList;

/**
 * 被观察的天气数据类
 */
public class WeatherData implements Subject {

    ArrayList<Observer> list;
    float temperature, humidity, pressure;

    public WeatherData(){
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = list.indexOf(o);
        if(i >= 0){
            list.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer o : list){
            o.update(temperature, humidity, pressure);
        }
    }

    /**
     * 数据改变
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
