package com.wade.adam.patterns.behavioral.template.dz;

public class IPhoneCompiler extends CrossCompiler {
    protected void collectSource() {
        System.out.println("Collect Source iPhone");
    }
    protected void compileToTarget() {
        System.out.println("iPhone Specific Compilation");
    }
}
