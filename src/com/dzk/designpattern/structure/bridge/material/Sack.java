package com.dzk.designpattern.structure.bridge.material;

public class Sack implements Material{
    @Override
    public void draw() {
        System.out.println("用麻袋");
    }
}
