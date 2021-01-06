package com.dzk.designpattern.create.singleton;

public class SessionCountClient {
    public static void main(String[] args) {
        //开门营业
        SessionCount count = SessionCount.getInstance();
        count.plus();
        count.showMsg();

        SessionCount count2 = SessionCount.getInstance();
        count2.plus();
        count2.showMsg();

        //出去一个
        SessionCount count3 = SessionCount.getInstance();
        count3.decrease();
        count3.showMsg();
    }
}
