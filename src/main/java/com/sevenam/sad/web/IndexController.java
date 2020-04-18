package com.sevenam.sad.web;

import com.sevenam.sad.config.auth.LoginUser;
import com.sevenam.sad.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
//----------------------------------------
//-- IndexController.java
//----------------------------------------
public class IndexController {

    private final HttpSession httpSession;

    @GetMapping("/")
    public String Index(Model model, @LoginUser SessionUser user) {
        if (user != null) {
            model.addAttribute("userName", user.getName());
        }
        return "index";
    }
}
