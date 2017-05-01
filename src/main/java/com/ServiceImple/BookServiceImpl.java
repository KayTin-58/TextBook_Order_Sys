package com.ServiceImple;

import com.mapper.BookMapper;
import com.po.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 直到世界尽头 on 4/20 0020.
 */

@Service
public class BookServiceImpl implements BookService{

     @Autowired
     public BookMapper  bkmap;


    /**
     * 根据书本的NAME和ISBN查询教材
     * @param bk
     * @return
     */
    @Override
    public Book IsCunzaiBookByNameAndISBN(Book bk) {

        return bkmap.selectByISBNAndbookname(bk);
    }


    /**
     * 单个添加教材
     * @param bk
     */
    @Override
    public void addBook(Book bk) {
        bkmap.insertBook(bk);
    }


    /**
     * 批量添加书本教材
     * @param bks
     */
    @Override
    public void addBooks(List<Book> bks) {
        for(int i=0;i<bks.size();i++){
            this.addBook(bks.get(i));
        }
    }

    /**
     * 跟新书本教材数量信息
     * @param bk
     */
    @Override
    public void updateBkNum(Book bk) {
        Book book=this.IsCunzaiBookByNameAndISBN(bk);
        int num=0;//原始数量
        if(book!=null){
            num=book.getQuantity();
        }
        num=num+bk.getQuantity();
        bk.setQuantity(num);

        bkmap.updateBookNum(bk);
    }


    /**
     *批量跟新教材信息
     * @param bks
     */
    @Override
    public void updateList(List<Book> bks){
        for(int i=0;i<bks.size();i++){
            this.updateBkNum(bks.get(i));
        }
    }


    @Override
    public List<Book> getAllBook() {

        return bkmap.selectAllBook();
    }
}
