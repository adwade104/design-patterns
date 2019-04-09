package com.wade.adam.patterns.structural.facade.banas;

public class SecurityCodeCheck {

    private int securityCode = 1234;

    public boolean codeCorrect(int securityCodeToCheck){
        return securityCode == securityCodeToCheck ;
    }

}
