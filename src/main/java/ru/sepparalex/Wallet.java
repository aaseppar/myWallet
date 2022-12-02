package ru.sepparalex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Wallet {
    @Autowired
    private List<Money> wallet;

    public void showBalance(){
        for(Money money : wallet) {
            System.out.printf("Count: %f; Currency: %s\n", money.getCount(), money.getCurrency().getCurrencyName());
        }
    }
}