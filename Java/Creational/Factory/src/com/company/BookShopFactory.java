package com.company;

public  class BookShopFactory {

     public Book getBook(String booktype){
          if(booktype == "A"){
             return new BookTypeA();
          }else if (booktype == "B"){
               return new BooktypeB();
          }else if (booktype == "C") {
               return new BookTypeC();
          }else {
               return null;
          }
     }

}

