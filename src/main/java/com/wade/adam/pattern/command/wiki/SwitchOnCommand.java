package com.wade.adam.pattern.command.wiki;

public class SwitchOnCommand implements Command {

    private final Light light;

    public SwitchOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

}
