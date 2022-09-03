package com.bashan.yewu.controller;

import com.bashan.yewu.service.mail.MailSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class LoginController {

    @Autowired
    MailSendService mailSendService;

    @GetMapping("login")
    public String login() {
//        mailSendService.sendSimpleMail("1462059721@qq.com", "second send.", "hello, zhaokeke.");
        return "test";
    }
}
