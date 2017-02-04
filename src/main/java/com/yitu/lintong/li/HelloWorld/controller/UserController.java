package com.yitu.lintong.li.HelloWorld.controller;

import com.yitu.lintong.li.HelloWorld.model.User;
import com.yitu.lintong.li.HelloWorld.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/userShow")
    public String index(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userService.getUserById(userId);
        model.addAttribute("user", user);
        return "userShow";
    }
}
