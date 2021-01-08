package com.dzk.designpattern.action.command;

public class ListView {
    private Command command;

    public ListView(Command command) {
        this.command = command;
    }

    public String getView(){
        if (null != command){
            System.out.println("首页请求");
            String response = command.execute();
            System.out.println("当前列表: " + response);
            return response;
        }
        return null;
    }
}
