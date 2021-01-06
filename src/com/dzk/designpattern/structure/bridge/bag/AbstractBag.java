package com.dzk.designpattern.structure.bridge.bag;

import com.dzk.designpattern.structure.bridge.material.Material;

/**
 * 采摘容器
 */
public abstract class AbstractBag {
    protected Material material;

    public void setMaterial(Material material) {
        this.material = material;
    }
    //采摘
    public abstract void pick();
}
