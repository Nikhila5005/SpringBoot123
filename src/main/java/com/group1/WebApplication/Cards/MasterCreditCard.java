package com.group1.WebApplication.Cards;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("MasterCreditCard")
public class MasterCreditCard implements CreditCard{
    public MasterCreditCard() {
        System.out.println("this is default constructor");
    }

    @Override
    public void distributer() {
        System.out.println(" We Are Distributing MasterCredit Cards");

    }

    @PostConstruct

    public void init(){
        System.out.println("this is PostConstructor");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("this is destroy constructor");
    }

}
