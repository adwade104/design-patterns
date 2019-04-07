package com.wade.adam.pattern.interpreter.wiki;

import java.util.Map;

public interface Expression {
    int interpret(Map<String, Integer> context);
}
