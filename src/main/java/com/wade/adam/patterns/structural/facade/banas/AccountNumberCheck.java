package com.wade.adam.patterns.structural.facade.banas;

public class AccountNumberCheck {

    private int accountNumber = 12345678;

    public boolean accountActive(int acctNumToCheck){
        return accountNumber == acctNumToCheck;
    }

}
