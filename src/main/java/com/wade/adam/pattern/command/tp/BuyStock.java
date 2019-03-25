package com.wade.adam.pattern.command.tp;

public class BuyStock implements Order {

    private IStock IStock;

    public BuyStock(IStock IStock) {
        this.IStock = IStock;
    }

    @Override
    public void execute() {
        IStock.buy();
    }

}
