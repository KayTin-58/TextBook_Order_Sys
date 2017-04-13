package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 直到世界尽头 on 4/11 0011.
 *
 *
 * 学院  专业  学生  等信息控制
 */

@Controller
@RequestMapping("/student")
public class StudentsInfoCountroller {


    @RequestMapping("/faculty")
    @ResponseBody
    public List<String> Getfacultys(){
        return null;
    }
}
