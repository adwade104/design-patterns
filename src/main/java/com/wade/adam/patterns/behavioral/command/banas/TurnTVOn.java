package com.wade.adam.patterns.behavioral.command.banas;

public class TurnTVOn implements Command {

    private ElectronicDevice device;

    public TurnTVOn(ElectronicDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {

        device.on();

    }

    @Override
    public void undo() {

        device.off();

    }

}
