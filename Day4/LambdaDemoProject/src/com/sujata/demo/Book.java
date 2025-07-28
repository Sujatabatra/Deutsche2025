package com.sujata.demo;

public class Book {
    private int bookId;
    private String bookName;
    private int price;
    private int noOfPages;

    public Book(){

    }

    public Book(int bookId, String bookName, int price, int noOfPages) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.noOfPages = noOfPages;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", noOfPages=" + noOfPages +
                '}';
    }
}
