package com.mapper;

import com.po.RequisitionOrder;

import java.util.ArrayList;

/**
 * Created by 直到世界尽头 on 3/12 0012.
 */
public interface BoookOrderMapper {

    /**
     * 获取订阅单申请为通过的数量
     * @param flag
     * @return
     */
    public int getAccount(boolean flag);


    /**
     * 获取所有的没有通过审批的订单
     * @param state
     * @return
     */
    public ArrayList<RequisitionOrder> selectAllOrderByState(Boolean state);


    /**
     * 获取所有的订单
     * @return
     */
    public ArrayList<RequisitionOrder> selectAllOrder();


    /**
     * 根据id删除订单
     * @param id
     */
    public void deleteById(Integer id);


    /**
     * 根据id查询一条记录
     * @param id
     * @return
     */
    public RequisitionOrder  selectById(Integer id);


    /**
     * 根据id更新订阅单的状态
     * @param id
     */
    public void updateOrderStateByID(Integer id);


    /**
     * 插入一条订阅单记录
     * @param ro
     */
    public void insertOrder(RequisitionOrder ro);

}
