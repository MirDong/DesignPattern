package com.dzk.designpattern.structure.bridge.bag;

public class MiddleBag extends AbstractBag {
    @Override
    public void pick() {
        System.out.println("开始采摘水果");
        material.draw();
        System.out.println("采摘一中型袋");
    }
}
