package com.dzk.designpattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class DistinctNode extends Node{
    private List<Node>children = new ArrayList<>();

    public DistinctNode(String name) {
        super(name);
    }

    @Override
    public List<Node> getChildren() {
        return children;
    }

    public void addChild(Node node){
        children.add(node);
    }

    public void removeChild(int index){
        children.remove(index);
    }
}
