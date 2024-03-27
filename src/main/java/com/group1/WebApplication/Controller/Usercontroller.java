package com.group1.WebApplication.Controller;

import com.group1.WebApplication.UserPack.user;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Usercontroller {

    @GetMapping("/addUser")
    public String userpage(Model model){
        model.addAttribute("user",new user());
        System.out.println("this is get request");
        return "addUser";
    }



//    @GetMapping("/addUser")
//    public String sendForm(User user) {
//
//        System.out.println("this is get/request mapping/get request");
//        return "addUser";
//    }

    @PostMapping("/addUser")
    public String processForm(User user) {
        System.out.println("this is post request");
        return "showMessage";
    }
}
