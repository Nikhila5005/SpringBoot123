package com.group1.WebApplication.Cards;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component




public class RupayCreditCard implements CreditCard{
    @Override
    public void distributer() {
        System.out.println("We Are Distributing RupayCredit Cards");

    }
}
