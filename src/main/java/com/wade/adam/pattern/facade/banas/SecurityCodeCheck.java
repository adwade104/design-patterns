package com.wade.adam.pattern.facade.banas;

public class SecurityCodeCheck {

    private int securityCode = 1234;

    public boolean codeCorrect(int securityCodeToCheck){
        return securityCode == securityCodeToCheck ;
    }

}
