package com.wade.adam.pattern.command.tp;

public class Driver {

    public static void main(String[] args){

        Stock stock = new Stock("ABC", 10);

        Order buyStock = new BuyStock(stock);
        Order sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();

    }

}
