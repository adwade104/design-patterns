package com.wade.adam.pattern.bridge.wiki;

public class SimpleAccount extends AbstractAccount {
    private int balance;

    public SimpleAccount(int balance) {
        this.balance = balance;
    }

    public boolean isBalanceLow() {
        return balance < 50;
    }

    public void withdraw(int amount) {
        operate("withdraw " + amount, () -> {
            if (balance >= amount) {
                balance -= amount;
                return true;
            }
            return false;
        });
    }
}
