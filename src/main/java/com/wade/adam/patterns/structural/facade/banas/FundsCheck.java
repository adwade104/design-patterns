package com.wade.adam.patterns.structural.facade.banas;

public class FundsCheck {

    private double cashInAccount = 1000.00;

    public boolean haveEnoughMoney(double cashToWithdraw){

        if(cashToWithdraw > cashInAccount){

            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + cashInAccount);

            return false;
        }

        decreaseCashInAccount(cashToWithdraw);
        System.out.println("Withdrawal Complete. Current Balance: " + cashInAccount);

        return true;

    }

    public void makeDeposit(double cashToDeposit){

        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Complete. Current Balance: " + cashInAccount);

    }

    private void decreaseCashInAccount(double cashWithdrawn){
        cashInAccount -= cashWithdrawn;
    }

    private void increaseCashInAccount(double cashDeposited){
        cashInAccount += cashDeposited;
    }

}
