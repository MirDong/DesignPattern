package com.dzk.designpattern.structure.bridge;

import com.dzk.designpattern.structure.bridge.bag.AbstractBag;
import com.dzk.designpattern.structure.bridge.bag.BigBag;
import com.dzk.designpattern.structure.bridge.material.Material;
import com.dzk.designpattern.structure.bridge.material.Paper;

public class BridgeClient {
    public static void main(String[] args) {
        //袋子型号
        AbstractBag bag = new BigBag();
        //袋子材质
        Material paper = new Paper();
        bag.setMaterial(paper);
        //开始采摘
        bag.pick();
    }
}
