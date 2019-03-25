package com.wade.adam.pattern.command.tp;

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
