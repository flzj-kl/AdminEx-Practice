package com.flzj.admin.controller;

import com.flzj.admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    /**
     * 来到登入页面
     * @return
     */
    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }

    /**
     * 来到首页(重定向
     * @return
     */
    @PostMapping("/login")
    public String RedirectIndex(User user, Model model , HttpSession httpSession){
        if(user.getUsername().length() != 0 && user.getPassword().length() != 0) {
            httpSession.setAttribute("loginUser",user);
            // 登入成功
            return "redirect:/index.haha";
        } else{
            model.addAttribute("msg","账号或密码错误!");
            return "login";
        }
    }

    @GetMapping("/index.haha")
    public String toIndex(HttpSession httpSession,Model model){
/*        User user = (User) httpSession.getAttribute("loginUser");
        // 登入成功
        if(user != null) {
            return "index";
        }else{
            model.addAttribute("msg","请先登入");
            return "login";
        }*/
        return "index";
    }
}
