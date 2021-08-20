package com.company;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopname;
    List<Book> books =  new ArrayList<>();

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    // Need to fetch data from the database and all the book names will come from the db
    public void loadData(){
        //fetching database data
        // For demo purpose I' ll add for loop
        for(int  i= 1;  i<=10 ;i++){
            //creating objct of book
            Book b = new Book();
            b.setBookID(i);
            b.setBookName("Book "+ i);
            getBooks().add(b);
        }
    }

    @Override
    public String  toString() {
        return "BookShop{" +
                "shopname='" + shopname + '\'' +
                ", books=" + books +
                '}';
    }

    //Internally this will create a clone for you
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop shop  =  new BookShop();
        // assigning the value
        // earlier we call the clone method  from 'bs' object
        // same we can access the method using this keyword
        // fetching the value
        for(Book b: this.getBooks()){
            //fetching data from old object to new
            // same thing?????
            // claification  - in first objct we are fetching data from the db
            // But in second object u r not ( fetching from all object
            shop.getBooks().add(b);
        }
        return  shop;

    }
}
