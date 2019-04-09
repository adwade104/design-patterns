package com.wade.adam.patterns.behavioral.command.wiki;

public class Driver {

    public static void main(String[] args){
        Light lamp = new Light();

        Command switchOn = new SwitchOnCommand(lamp);
        Command switchOff = new SwitchOffCommand(lamp);

        Switch lightSwitch = new Switch();
        lightSwitch.register("on", switchOn);
        lightSwitch.register("off", switchOff);

        lightSwitch.execute("on");
        lightSwitch.execute("off");
    }

}
