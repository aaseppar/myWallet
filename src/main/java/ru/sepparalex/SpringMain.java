package ru.sepparalex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//точка входа
public class SpringMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(SpringConfig.class);
        Wallet wallet = context.getBean("wallet", Wallet.class);
        wallet.showBalance();

        context.close();


    }


}

