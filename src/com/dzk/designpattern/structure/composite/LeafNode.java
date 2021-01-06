package com.dzk.designpattern.structure.composite;

import java.util.List;

public class LeafNode extends Node{
    public LeafNode(String name) {
        super(name);
    }

    @Override
    public List<Node> getChildren() {
        return null;
    }
}
