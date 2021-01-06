package com.dzk.designpattern.structure.bridge.material;

public class Planstic implements Material{
    @Override
    public void draw() {
        System.out.println("用塑料袋");
    }
}
