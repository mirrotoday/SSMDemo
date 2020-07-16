package com.spring.list.controller;
import com.spring.list.entity.User;
import com.spring.list.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * User 的控制类
 *
 * @author Freestyle
 */
@Controller
@RequestMapping("")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value ="index")
    public String findUser(Model model) {
        int id = 1;
        User user = this.userService.findUserByid(id);
        model.addAttribute("user", user);
        return "index";
    }
}