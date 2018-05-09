package sample.observerpattern;

/**
 * 观察者
 */
public class CurrentConditionsDisplay implements Observer {

    Subject subject;
    float temperature, humidity, pressure;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("temperature=" + temperature + ",humidity=" + humidity + ",pressure=" + pressure);
    }
}
