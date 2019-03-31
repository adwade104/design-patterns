package com.wade.adam.pattern.template.dz;

public class AndroidCompiler extends CrossCompiler {
    protected void collectSource() {
        System.out.println("Collect Source Android");
    }
    protected void compileToTarget() {
        System.out.println("Android Specific Compilation");
    }
}
