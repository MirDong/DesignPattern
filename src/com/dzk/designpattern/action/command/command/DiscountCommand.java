package com.dzk.designpattern.action.command.command;

import com.dzk.designpattern.action.command.Command;
import com.dzk.designpattern.action.command.handler.DiscountHandler;

public class DiscountCommand implements Command {
    private DiscountHandler discountHandler = new DiscountHandler();
    @Override
    public String execute() {
        return discountHandler.getDiscount();
    }
}
