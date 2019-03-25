package com.wade.adam.pattern.command.wiki;

public class SwitchOffCommand implements Command {

    private Light light;

    public SwitchOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

}
