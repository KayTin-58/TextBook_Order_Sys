package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 直到世界尽头 on 3/11 0011.
 */


/**
 *
 */
@Controller
@RequestMapping("/class")
public class MainController {


    //院系信息管理
    @RequestMapping("/faculty")
    public String HomeSrc(){
        //System.out.println("ggfhdsgfsdgfgfsgf");
        return "";
    }
}
