package com.ServiceImple;

import com.po.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 直到世界尽头 on 4/21 0021.
 */

@Service
public class BookAndBookOrderServiceImpl {

    @Autowired
    BookOrderServiceImpl bkorderService;
    @Autowired
    BookServiceImpl   bkservice;



    /**
     * 根据订单情况来跟新教材库存信息
     * @param ids
     */

    public void  updateBookInfByBookOrder(Integer[] ids){
        List<Book> lists=bkorderService.getListByIds(ids);

        for(int i=0;i<lists.size();i++){
            Book bk=bkservice.IsCunzaiBookByNameAndISBN(lists.get(i));
            if(bk!=null){
                //跟新数量
                bkservice.updateBkNum(lists.get(i));
            }else{
                //添加新教材信息
                bkservice.addBook(lists.get(i));
            }
        }

    }
}
