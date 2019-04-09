package com.wade.adam.patterns.behavioral.command.banas;

public class TurnTVUp implements Command {

    private ElectronicDevice device;

    public TurnTVUp(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumeDown();
    }

}
