package com.guangdong.ordersystem.controller;

import com.guangdong.ordersystem.pojo.User;
import com.guangdong.ordersystem.service.UserService;
import com.guangdong.ordersystem.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/toLogin")
    public String toLogin() {
        return "/login";
    }
    @PostMapping("/login")
    public String login(String username, String userpassword, Map<String,Object> map, HttpSession session) {
            User user = userService.selectByUsername(username);
        System.out.println("username = [" + username + "], userpassword = [" + userpassword + "], map = [" + map + "], session = [" + session + "]");
            if(user!=null && user.getUserpassword().equals(MD5Util.encode(userpassword))){
                session.setAttribute("user",user);

                //登陆成功，防止表单重复提交，可以重定向到主页
                if (user.getIdentity() == 0)
                    return "/admin/main";
                else
                    return "/user/main";
            }else{
                //登陆失败
                map.put("msg","用户名密码错误");
                return  "login";
            }
    }


}
