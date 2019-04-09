package com.wade.adam.patterns.behavioral.interpreter.wiki;

import java.util.Map;

public interface Expression {
    int interpret(Map<String, Integer> context);
}
