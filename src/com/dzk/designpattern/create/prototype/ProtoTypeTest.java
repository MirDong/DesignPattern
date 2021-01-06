package com.dzk.designpattern.create.prototype;

/**
 * 原型创建模式
 */
public class ProtoTypeTest {
    public static void main(String[] args) {
        Sheep old = new Sheep(3,"雄性",new Admin(20,"男"));
        System.out.println(old.toString());
        Sheep current = old.clone();
        System.out.println(current.toString());


        //对克隆羊处理
        current.setAge(1);
        current.setSex("雌性");
        current.getAdmin().setAge(18);
        current.getAdmin().setSex("女");
        System.out.println(old.toString());
        System.out.println(current.toString());

    }
}
