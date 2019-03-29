package com.wade.adam.pattern.facade.wiki;

public class CPU {

    public void freeze() {

        System.out.println("Processor froze.");

    }
    public void jump(long position) {

        System.out.println("Processor jumped to position: " + position);

    }
    public void execute() { System.out.println("Processor executing..."); }


}
