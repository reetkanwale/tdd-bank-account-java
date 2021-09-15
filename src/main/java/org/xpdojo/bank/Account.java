package org.xpdojo.bank;

public class Account {
    int balance;
    public int getBalance() {
        return balance;
    }

    public void addBalance(int deposit) {
        balance += deposit;
    }
}
