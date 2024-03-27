package com.group1.WebApplication.Controller;

import com.group1.WebApplication.Cards.CreditCard;
import com.group1.WebApplication.Cards.RupayCreditCard;
import com.group1.WebApplication.UserPack.user;
import org.apache.catalina.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//@RestController

@Controller

public class Message {


    @Autowired
    @Qualifier("MasterCreditCard")
    CreditCard creditCard;

    @GetMapping("/Message")
    public String displaynames(Model model) {
        model.addAttribute("Message", "helloworld");
        creditCard.distributer();
        return "Welcome";


    }
    @RequestMapping()
    public String Nikhila(){
        System.out.println("This is Request Mapping");
        return "Welcome";
    }


//    @RequestMapping("/login")
//    public String micky(Model model){
//        model.addAttribute("login","nikhila@5005");
//        return "Login";
//    }
//
//    @PostMapping("/addUser")
//
//    public String processform(User user){
//        System.out.println(user.getUsername()+ "and password"+user.getPassword());
//        System.out.println("this is post request");
//        return "Login";
//    }



}





