package com.wade.adam.pattern.facade.banas;

public class AccountNumberCheck {

    private int accountNumber = 12345678;

    public boolean accountActive(int acctNumToCheck){
        return accountNumber == acctNumToCheck;
    }

}
