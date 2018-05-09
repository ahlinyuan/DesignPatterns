package sample.observerpattern;

/**
 * 被观察者接口
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
