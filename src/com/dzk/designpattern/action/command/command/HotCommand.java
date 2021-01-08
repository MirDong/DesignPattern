package com.dzk.designpattern.action.command.command;

import com.dzk.designpattern.action.command.Command;
import com.dzk.designpattern.action.command.handler.HotHandler;

public class HotCommand implements Command {
    private HotHandler hotHandler = new HotHandler();
    @Override
    public String execute() {
        return hotHandler.getHot();
    }
}
