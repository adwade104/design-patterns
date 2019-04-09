package com.wade.adam.patterns.behavioral.mediator.banas;

import java.util.ArrayList;
import java.util.List;

public class StockMediator implements Mediator {

    private List<Colleague> colleagues;
    private List<StockOffer> stockBuyOffers;
    private List<StockOffer> stockSellOffers;

    private int colleagueCodes;

    public StockMediator() {
        this.colleagues = new ArrayList<>();
        this.stockBuyOffers = new ArrayList<>();
        this.stockSellOffers = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
        colleagueCodes++;
        colleague.setColleagueCode(colleagueCodes);
    }

    @Override
    public void saleOffer(String stock, int shares, int colleagueCode) {

        boolean stockSold = false;

        for(StockOffer offer: stockBuyOffers){

            if(stock.equalsIgnoreCase(offer.getStockSymbol()) && shares == offer.getStockShares()){

                System.out.println(shares + " shares of " + stock +
                        " sold to colleague code " + offer.getColleagueCode());

                stockBuyOffers.remove(offer);
                stockSold = true;

            }

            if(stockSold){ break; }

        }

        if(!stockSold){

            System.out.println(shares + " share of " + stock + " added to inventory");

            StockOffer stockOffer = new StockOffer(shares, stock, colleagueCode);
            stockSellOffers.add(stockOffer);

        }

    }

    @Override
    public void buyOffer(String stock, int shares, int colleagueCode) {

        boolean stockBought = false;

        for(StockOffer offer: stockSellOffers){

            if(stock.equalsIgnoreCase(offer.getStockSymbol()) && shares == offer.getStockShares()){

                System.out.println(shares + " shares of " + stock +
                        " bought bt colleague code " + offer.getColleagueCode());

                stockSellOffers.remove(offer);
                stockBought = true;

            }

            if(stockBought){ break; }

        }

        if(!stockBought){

            System.out.println(shares + " share of " + stock + " added to inventory");

            StockOffer stockOffer = new StockOffer(shares, stock, colleagueCode);
            stockBuyOffers.add(stockOffer);

        }

    }

    public void getStockOfferings(){

        System.out.println("\nStocks for Sale");

        for(StockOffer offer: stockSellOffers){

            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());

        }

        System.out.println("\nStock Buy Offers");

        for(StockOffer offer: stockBuyOffers){

            System.out.println(offer.getStockShares() + " of " + offer.getStockSymbol());

        }

    }

}
