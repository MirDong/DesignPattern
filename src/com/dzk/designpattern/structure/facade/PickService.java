package com.dzk.designpattern.structure.facade;

import com.dzk.designpattern.structure.bridge.bag.AbstractBag;
import com.dzk.designpattern.structure.bridge.bag.SmallBag;
import com.dzk.designpattern.structure.bridge.material.Material;
import com.dzk.designpattern.structure.bridge.material.Paper;

/**
 * 采摘服务
 */
public class PickService {
    //采摘水果
    public void doPick(){
        //袋子型号
        AbstractBag bag = new SmallBag();
        //袋子材料
        Material paper = new Paper();
        bag.setMaterial(paper);
        //开始采摘
        bag.pick();
    }
}
