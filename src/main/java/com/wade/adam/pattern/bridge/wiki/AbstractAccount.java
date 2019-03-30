package com.wade.adam.pattern.bridge.wiki;

import java.util.function.BooleanSupplier;

abstract class AbstractAccount {

    private Logger LOGGER = Logger.info();

    public void setLogger(Logger LOGGER) {
        this.LOGGER = LOGGER;
    }

    protected void operate(String message, BooleanSupplier action) {
        boolean result = action.getAsBoolean();
        LOGGER.log(message + " result " + result);
    }

}
