package com.dzk.designpattern.create.singleton;

import java.util.concurrent.atomic.AtomicInteger;

public class SessionCount {
    AtomicInteger count = new AtomicInteger(0);
    private SessionCount(){}
    private static SessionCount instance;

    public static SessionCount getInstance(){
        //双重校验锁
        if (instance == null){
            synchronized (SessionCount.class){
                if (instance == null){
                    instance = new SessionCount();
                }
            }
        }
        return instance;
    }

    /**************以下是业务方法****************/
    public int plus(){return count.incrementAndGet();}
    public int decrease(){return count.decrementAndGet();}
    public void showMsg(){
        System.out.println("当前人数: " + count.get());
    }
}
