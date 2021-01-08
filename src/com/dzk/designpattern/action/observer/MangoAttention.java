package com.dzk.designpattern.action.observer;

/**
 * 观察者管理
 */
public class MangoAttention extends Attention{
    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            //通知变化
            observer.update();
        }
    }
}
