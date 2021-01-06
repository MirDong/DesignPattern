package com.dzk.designpattern.structure.composite;

import com.alibaba.fastjson.JSON;

/**
 * 组合模式  省市县目录结构
 */
public class CompositeClient {
    public static void main(String[] args) {
        DistinctNode root = new DistinctNode("根");
        root.addChild(new DistinctNode("天津"));
        root.addChild(new DistinctNode("上海"));
        DistinctNode distinctNode = new DistinctNode("北京");
        root.addChild(distinctNode);

        distinctNode.addChild(new DistinctNode("朝阳区"));
        distinctNode.addChild(new DistinctNode("海淀区"));
        distinctNode.addChild(new DistinctNode("大兴区"));
        DistinctNode distinctNode2 = new DistinctNode("昌平区");
        distinctNode.addChild(distinctNode2);


        distinctNode2.addChild(new LeafNode("回龙观东大街"));
        distinctNode2.addChild(new LeafNode("天通苑"));

        System.out.println(JSON.toJSON(root));
    }
}
