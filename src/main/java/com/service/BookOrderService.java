package com.service;

import com.po.RequisitionOrder;

import java.util.List;

/**
 * Created by 直到世界尽头 on 3/12 0012.
 */
public interface BookOrderService {


    /**
     * 获取订阅申请单的总数量
     * @param flag
     * @return
     */
    public int getAccoutByState(boolean flag);

    /**
     * 获取所有的订单
     * @return
     */
    public List<RequisitionOrder> selectAllOrder();

    /**
     * 获取所有的未通过审批的订单
     * @param state
     * @return
     */
    public List<RequisitionOrder> selectAllOrderByState(Boolean state);


    /**
     * 通过id删除订阅单
     * @param id
     */
    public void deleteById(Integer id);


    /**
     * 根据Id查询一条记录
     * @param id
     * @return
     */
    public RequisitionOrder selectOneByID(Integer id);


    public void updateOrderStateByID(Integer id);
}
