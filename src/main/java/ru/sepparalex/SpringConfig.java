package ru.sepparalex;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("ru.sepparalex")
@PropertySource("classpath:money.properties")
public class SpringConfig {
    @Bean

    public Money dollarAll(@Value("${money.dollar}") double dollar){
        return new Money(dollar, new Dollar());
    }

    @Bean
    public Money euroAll(@Value("${money.euro}") double euro){
        return new Money(euro, new Euro());
    }
    @Bean
    public Money pesoAll(@Value("${money.peso}") double peso){
        return new Money(peso, new Peso());
    }
    @Bean
    public Money rubleAll(@Value("${money.ruble}") double ruble){
        return new Money(ruble, new Ruble());
    }
    @Bean
    public List<Money> moneyList() {
        List<Money> list = new ArrayList<>();
        list.add(dollarAll(0.0));
        list.add(euroAll(0.0));
        list.add(pesoAll(0.0));
        list.add(rubleAll(0.0));
        return list;
    }
}

