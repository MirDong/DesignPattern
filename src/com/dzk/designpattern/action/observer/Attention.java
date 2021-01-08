package com.dzk.designpattern.action.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 通知收集器
 */
public abstract class Attention {
    protected List<Observer> observerList = new ArrayList<>();
    public void addObserver(Observer observer){observerList.add(observer);}
    public void removeObserver(Observer observer){observerList.remove(observer);}

    public abstract void notifyObservers();
}
