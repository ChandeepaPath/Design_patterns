package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopname("Sarasavi");
        bs.loadData();

        // this will also affecting bs1 . Look at the ouput
        //simply we have one object and have two references in shallow copy

        //-------------------------
        // deep cloning - has two objects , one will not  affect each other


        //  BookShop bs1 = (BookShop)bs.clone();
        BookShop bs1 = bs.clone();
        bs.getBooks().remove(2);
        bs1.setShopname("Chandeepa Poth Madura");
        // we are still asking to fetch data from the db
        // bs1.loadData();

        System.out.println(bs);
        System.out.println(bs1);

        // So even without loading the data, we are getting everything
    }
}


// Basic idea it if you can create a prototype , you an create multiple copies from that.
//