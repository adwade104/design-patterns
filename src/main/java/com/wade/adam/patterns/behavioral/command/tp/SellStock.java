package com.wade.adam.patterns.behavioral.command.tp;

public class SellStock implements Order {

    private IStock IStock;

    public SellStock(IStock IStock) {
        this.IStock = IStock;
    }

    @Override
    public void execute() {
        IStock.sell();
    }

}
