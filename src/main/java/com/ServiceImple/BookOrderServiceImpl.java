package com.ServiceImple;


import com.mapper.BoookOrderMapper;
import com.po.RequisitionOrder;
import com.service.BookOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by 直到世界尽头 on 3/12 0012.
 */

@Service

public class BookOrderServiceImpl implements BookOrderService{


    @Autowired
    private BoookOrderMapper bookordermp;


    @Override
    public int  getAccoutByState(boolean flag){
        return bookordermp.getAccount(flag);
    }


    @Override
    public ArrayList<RequisitionOrder> selectAllOrder() {

         return bookordermp.selectAllOrder();
    }

    @Override
    public ArrayList<RequisitionOrder> selectAllOrderByState(Boolean state) {

        return bookordermp.selectAllOrderByState(state);
    }

    @Override
    public void deleteById(Integer id){
        bookordermp.deleteById(id);
    }


    /**
     * 根据id集删除一个订单集
     * @param array
     */
    public void DeleteAllByIdArray(Integer[] array){
        for(int i=0;i<array.length;i++){
            this.deleteById(array[i]);
        }

    }

    @Override
    public RequisitionOrder selectOneByID(Integer id){
        return bookordermp.selectById(id);
    }


    @Override
    public void updateOrderStateByID(Integer id){
        //需要新教材库存

        bookordermp.updateOrderStateByID(id);
    }
}
