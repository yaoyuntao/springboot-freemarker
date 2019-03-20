package org.spring.springboot.controller;

import org.spring.springboot.dao.UsersMapper;
import org.spring.springboot.domain.Users;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Rich  yaoyuntao
 * Date: 2019/3/19
 * Time: 22:20
 * Description: No Description
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/queryall",method = RequestMethod.GET)
    private String queryall(Model model){
        List<Users> usersList = userService.queryAllUsers();
        model.addAttribute("userView",usersList);
        return  "userView";
    }
}
