package com.po;

/**Book基础表
 * Created by 直到世界尽头 on 3/12 0012.
 */
public class Book {


    private Integer bookid;
    private String bookname;//书名
    private String author;//作者
    private String press;//出版社
    private String isbn;//国际标准号
    private String version;//版本
    private int quantity;//数量
    private String unitprice;//单价



//    public void BookSeter(RequisitionOrder ro) {
//        this.press=ro.getPress();
//        this.author=ro.getAuthor();
//        this.version=ro.getVersion();
//        this.isbn=ro.getIsbn();
//        this.quantity=ro.getQuantity();
//        this.bookname=ro.getBookname();
//    }


    public void setUnitprice(String unitprice) {
        this.unitprice = unitprice;
    }

    public String getUnitprice() {
        return unitprice;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", press='" + press + '\'' +
                ", isbn='" + isbn + '\'' +
                ", version='" + version + '\'' +
                ", quantity='" + quantity + '\'' +
                ", unitprice='" + unitprice + '\'' +
                '}';
    }
}
