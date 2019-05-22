package com.sailing.springbootmybatis.controller;

import com.sailing.springbootmybatis.service.UserinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserinfoService userinfoService;


    @RequestMapping("/test")
    public Object test(){
        return userinfoService.deleteUser(0);
    }

}
