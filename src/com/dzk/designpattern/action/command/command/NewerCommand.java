package com.dzk.designpattern.action.command.command;

import com.dzk.designpattern.action.command.Command;
import com.dzk.designpattern.action.command.handler.NewerHandler;

public class NewerCommand implements Command {
    private NewerHandler newerHandler = new NewerHandler();
    @Override
    public String execute() {
        return newerHandler.getNewer();
    }
}
