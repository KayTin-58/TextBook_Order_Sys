package com.controller;

/**
 * Created by 直到世界尽头 on 3/12 0012.
 */

import com.ServiceImple.BookOrderServiceImpl;
import com.po.RequisitionOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * 教材订阅单审批
 */


@Controller
@RequestMapping("/order")
public class ApprovalController {

    @Autowired
    BookOrderServiceImpl orderService;

    //获取所有的订单数据
    @RequestMapping(value="/getAll",method = RequestMethod.GET)
    @ResponseBody
    public List<RequisitionOrder> getAllOrder(){
        ArrayList<RequisitionOrder> list=new ArrayList<RequisitionOrder>();
        list=orderService.selectAllOrder();
        System.out.println(list);
        return list;
    }



    //删除订阅单的请求
    @RequestMapping(value="/deleteAll")
    @ResponseBody
    public void DeleteAllYx(@RequestParam(value = "ids[]")Integer[]   ids){

           System.out.println("成功："+ids.length);
           //orderService.DeleteAllByIdArray(ids);

    }

    //获取所有的未通过的订单数据
    @RequestMapping(value="/getAllwtg",method = RequestMethod.GET)
    @ResponseBody
    public List<RequisitionOrder> getAllOrderwtg(){
        ArrayList<RequisitionOrder> list=new ArrayList<RequisitionOrder>();
        list=orderService.selectAllOrderByState(false);
        System.out.println(list);
        return list;
    }

    //获取所有的未通过的订单数据
    @RequestMapping(value="/approv",method = RequestMethod.POST)
    @ResponseBody
    public void qpproByIDlist(@RequestParam(value = "ids[]")Integer[]   ids){

    }


    @RequestMapping(value="/addItem",method = RequestMethod.POST)
    @ResponseBody
    public void AddOrder(RequisitionOrder ro){

        System.out.println("请求成功"+ro.getSession());
    }
}
