package com.controller;

import com.ServiceImple.BookOrderServiceImpl;
import com.ServiceImple.SysServiceImpl;
import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by 直到世界尽头 on 3/11 0011.
 */

@Controller
public class AuthorityController {

    @Autowired
    private SysServiceImpl sysmS;
    @Autowired
    private BookOrderServiceImpl orderS;
    //管理员登录验证
    @RequestMapping(value = "/LoginCheck",method= RequestMethod.POST)
    public ModelAndView SysLoginCheck(String account, String userpassword, HttpSession session) {

        ModelAndView md = new ModelAndView();
        int num = orderS.getAccoutByState(false);
        boolean flag = sysmS.judgment(account, userpassword);

        if (flag == true) {//验证通过
            //将用户信息存入session
            session.setAttribute("user", account);
            md.addObject("num", num);
            md.setViewName("main");
            return md;
        } else {//验证未通过
            md.addObject("error", "请检查您的账号密码是否有误！");
            md.setViewName("login");
        }
        return null;
    }
}
