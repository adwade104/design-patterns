package com.wade.adam.pattern.command.banas;

public class DeviceButton {

    private Command command;

    public DeviceButton(Command command) {
        this.command = command;
    }

    public void press(){

        command.execute();

    }

    public void pressUndo(){

        command.undo();

    }

}
