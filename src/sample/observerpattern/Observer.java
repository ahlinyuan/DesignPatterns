package sample.observerpattern;

/**
 * 观察者接口
 */
public interface Observer {

    void update(float temperature, float humidity, float pressure);
}
