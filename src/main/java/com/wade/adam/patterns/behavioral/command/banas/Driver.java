package com.wade.adam.patterns.behavioral.command.banas;

import java.util.ArrayList;
import java.util.List;

public class Driver {


    public static void main(String[] args){

        ElectronicDevice electronicDevice = TVRemote.getDevice();

        //--------------------------------------

        TurnTVOn onCommand = new TurnTVOn(electronicDevice);

        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();

        //--------------------------------------

        TurnTVOff offCommand = new TurnTVOff(electronicDevice);

        onPressed = new DeviceButton(offCommand);
        onPressed.press();

        //--------------------------------------

        TurnTVUp volumeUpCommand = new TurnTVUp(electronicDevice);

        onPressed = new DeviceButton(volumeUpCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();

        //---------------------------------------

        Television television = new Television();
        Radio radio = new Radio();

        List<ElectronicDevice> allDevices = new ArrayList<>();
        allDevices.add(television);
        allDevices.add(radio);

        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);

        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
        turnThemOff.press();

        //---------------------------------------

        turnThemOff.pressUndo();

        //---------------------------------------

        System.out.println("\nUndoing all commands...");

        List<Command> commands = new ArrayList<>();
        commands.add(turnOffDevices);
        commands.add(offCommand);
        commands.add(onCommand);
        commands.add(volumeUpCommand);

        for(Command command : commands){
            command.undo();
        }

    }


}
