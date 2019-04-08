package com.wade.adam.pattern.mediator.banas;

public interface Mediator {

    void addColleague(Colleague colleague);
    void saleOffer(String stock, int shares, int colleagueCode);
    void buyOffer(String stock, int shares, int colleagueCode);

}
