package com.mengshun.learndemo.LearnController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping()
public class LoginController {

   @RequestMapping("/tologin")
    public String  login(){

        return  "login";
    }


    @RequestMapping("/userhome")
    @ResponseBody
    public IMoocJSONResult  clientuser(String username){


        System.out.println("123123");
        System.out.println("username:::::::"+username);
        IMoocJSONResult im =    IMoocJSONResult.ok("12312");


       return im;
    }
}
