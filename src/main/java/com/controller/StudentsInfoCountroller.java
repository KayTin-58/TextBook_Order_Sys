package com.controller;

import com.ServiceImple.GradeinfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by 直到世界尽头 on 4/11 0011.
 *
 *
 * 学院  专业  学生  等信息控制
 */

@Controller
@RequestMapping("/stu")
public class StudentsInfoCountroller {

    @Autowired
    GradeinfoServiceImpl gradeService;


    /**
     * 获取所有的学院信息
     * @return
     */
    @RequestMapping(value="/faculty",method = RequestMethod.GET)
    @ResponseBody
    public List<String> Getfacultys(){
        return gradeService.getAllCollege();
    }


    /**
     * 根据学院获取专业信息
     * @return
     */
    @RequestMapping(value="/zhuanyes",method = RequestMethod.GET)
    @ResponseBody
    public List<String> GetZhuanYsByXY(String XYName){
        System.out.println("xueyuan"+XYName);
        return gradeService.getAllProfessionByCollege(XYName);
    }

}
