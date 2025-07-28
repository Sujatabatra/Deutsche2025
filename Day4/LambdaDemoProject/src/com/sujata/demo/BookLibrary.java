package com.sujata.demo;

import java.util.ArrayList;

public class BookLibrary {

    private ArrayList<Book> bookList=new ArrayList<>();

    public BookLibrary(){
        bookList.add(new Book(1,"Book 1",450,1000));
        bookList.add(new Book(2,"Book 2",1500,1200));
        bookList.add(new Book(3,"Book 3",1450,800));
        bookList.add(new Book(4,"Book 4",4150,1100));
        bookList.add(new Book(5,"Book 5",4510,2000));
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public ArrayList<Book> searchExpensiveBook(){
        ArrayList<Book> expensiveBooks=new ArrayList<>();
        for(Book book:bookList){
            if(book.getPrice()>2000)
                expensiveBooks.add(book);
        }
        return expensiveBooks;
    }

    public ArrayList<Book> searchThickBooks(){
        ArrayList<Book> thickBooks=new ArrayList<>();
        for(Book book:bookList){
            if(book.getNoOfPages()>1500)
                thickBooks.add(book);
        }
        return thickBooks;
    }

    public ArrayList<Book> searchBook(BookPredicate bookPredicate){
        ArrayList<Book> searchedBooks=new ArrayList<>();
        for(Book book:bookList){
            if(bookPredicate.test(book))
                searchedBooks.add(book);
        }
        return searchedBooks;
    }
}
