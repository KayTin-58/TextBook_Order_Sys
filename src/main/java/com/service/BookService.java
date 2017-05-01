package com.service;

import com.po.Book;

import java.util.List;

/**
 * Created by 直到世界尽头 on 4/20 0020.
 */
public interface BookService {

    public Book IsCunzaiBookByNameAndISBN(Book bk);

    public void addBook(Book bk);

    public void addBooks(List<Book> bks);

    public void updateBkNum(Book bk);

    public void updateList(List<Book> bks);

    public List<Book> getAllBook();


}
