package com.dzk.designpattern.action.command;

import com.dzk.designpattern.action.command.command.DiscountCommand;
import com.dzk.designpattern.action.command.command.HotCommand;

/**
 * 命令模式:将方法调用本身包装成一个对象(命令对象)
 * Handler本身不符合抽象编程的调用，改造成符合抽象编程
 */
public class CommandClient {
    public static void main(String[] args) {
        ListView listView = new ListView(new HotCommand());
        listView.getView();
    }
}
