package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    //定义观察者集合, 被观察者和观察者之间的关系是 1 to *
    private List<Observer> observers = new ArrayList<>();

    //添加观察者
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    //删除观察者
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    //观察者进行访问
    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }
}
