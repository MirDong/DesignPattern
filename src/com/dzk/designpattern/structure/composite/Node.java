package com.dzk.designpattern.structure.composite;

import java.util.List;

/**
 * 组合模式
 */
public abstract class Node {
    private String name;

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract List<Node>getChildren();
}
