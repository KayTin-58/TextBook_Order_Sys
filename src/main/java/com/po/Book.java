package com.po;

/**Book基础表
 * Created by 直到世界尽头 on 3/12 0012.
 */
public class Book {


    private String bookname;//书名
    private String author;//作者
    private String press;//出版社
    private String isbn;//国际标准号
    private String version;//版本
    private String quantity;//数量


    public void BookSeter(RequisitionOrder ro) {
        this.press=ro.getPress();
        this.author=ro.getAuthor();
        this.version=ro.getVersion();
        this.isbn=ro.getIsbn();
        this.quantity=ro.getQuantity();
        this.bookname=ro.getBookname();
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    public String getBookname() {
        return bookname;
    }

    public String getAuthor() {
        return author;
    }

    public String getPress() {
        return press;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getVersion() {
        return version;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

}
