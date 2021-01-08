package com.dzk.designpattern.entity;

import com.dzk.designpattern.action.visit.Visit;

public interface Fruit {
    int price();
    void draw();
    void pack(Bag bag);
    int accept(Visit visit);
}
