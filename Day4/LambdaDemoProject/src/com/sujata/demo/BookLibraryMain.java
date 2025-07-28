package com.sujata.demo;

public class BookLibraryMain {
    public static void main(String[] args) {
        BookLibrary delhiLibrary=new BookLibrary();
        System.out.println(delhiLibrary.getBookList());

        System.out.println(delhiLibrary.searchExpensiveBook());

        System.out.println("Thick Books with pages more than 1000:"+delhiLibrary.searchBook(new BookPredicate() {
            @Override
            public boolean test(Book book) {
                return book.getNoOfPages()>1000;
            }
        }));

        System.out.println("Thick Books with pages more than 1000:"+delhiLibrary.searchBook(book-> book.getNoOfPages()>1000));


    }
}
