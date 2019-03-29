package com.wade.adam.pattern.facade.banas;

public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    private AccountNumberCheck accountNumberChecker;
    private SecurityCodeCheck securityCodeChecker;
    private FundsCheck fundsChecker;

    private WelcomeToBank welcomeToBank;

    public BankAccountFacade(int accountNumber, int securityCode){

        this.accountNumber = accountNumber;
        this.securityCode = securityCode;

        welcomeToBank = new WelcomeToBank();
        accountNumberChecker = new AccountNumberCheck();
        securityCodeChecker = new SecurityCodeCheck();
        fundsChecker = new FundsCheck();

    }

    public void withdrawCash(double cashToGet){
        if(accountNumberChecker.accountActive(accountNumber) &&
            securityCodeChecker.codeCorrect(securityCode) &&
            fundsChecker.haveEnoughMoney(cashToGet)){

            System.out.println("Transaction Complete.\n");

        }
        else{
            System.out.println("Transaction Failed.\n");
        }

    }

    public void depositCash(double cashToDeposit){

        if(accountNumberChecker.accountActive(accountNumber) &&
                securityCodeChecker.codeCorrect(securityCode)){

            fundsChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction Complete.\n");
        }
        else{
            System.out.println("Transaction Failed.\n");
        }

    }

}
