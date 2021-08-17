package com.company;

public class Main {

    public static void main(String[] args) {
        BookShopFactory obj = new BookShopFactory();
        Book b = obj.getBook("A");
        b.Bookdetails();
    }
}


