package com.wade.adam.pattern.command.wiki;

import java.util.HashMap;

public class Switch {

    private final HashMap<String, Command> commandsByName = new HashMap<>();

    public void register(String commandName, Command command){
        commandsByName.put(commandName, command);
    }

    public void execute(String commandName){
        Command command = commandsByName.get(commandName);
        if(command == null){
            throw new IllegalStateException("No command registered for " + commandName);
        }

        command.execute();
    }

}
