package com.dzk.designpattern.structure.bridge.material;

public class Paper implements Material{
    @Override
    public void draw() {
        System.out.println("用纸盒");
    }
}
