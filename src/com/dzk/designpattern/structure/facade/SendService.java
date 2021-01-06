package com.dzk.designpattern.structure.facade;

import com.alibaba.fastjson.JSON;
import com.dzk.designpattern.structure.bridge.bag.AbstractBag;
import com.dzk.designpattern.structure.bridge.bag.SmallBag;
import com.dzk.designpattern.structure.bridge.material.Material;
import com.dzk.designpattern.structure.bridge.material.Paper;
import com.dzk.designpattern.structure.composite.DistinctNode;
import com.dzk.designpattern.structure.composite.LeafNode;

/**
 * 快递服务
 */
public class SendService {
    //快递水果,指定目的地
    public void doSend(){
        //一级目录
        DistinctNode root = new DistinctNode("根");
        root.addChild(new DistinctNode("天津"));
        root.addChild(new DistinctNode("上海"));
        DistinctNode distinctNode = new DistinctNode("北京");
        root.addChild(distinctNode);

        //二级目录
        distinctNode.addChild(new DistinctNode("朝阳区"));
        distinctNode.addChild(new DistinctNode("海淀区"));
        distinctNode.addChild(new DistinctNode("大兴区"));
        DistinctNode distinctNode2 = new DistinctNode("昌平区");
        distinctNode.addChild(distinctNode2);


        //三级目录
        distinctNode2.addChild(new LeafNode("回龙观东大街"));
        distinctNode2.addChild(new LeafNode("天通苑"));

        System.out.println("选择收货地址: "+JSON.toJSON(root));
        System.out.println("目的地: 北京-昌平区-回龙观东大街");


    }
}
