package com.company;

public class Main {

    public static void main(String[] args) {
        //get the object
        SingletonEagerInitialized obj =  SingletonEagerInitialized.getInstance();

        //display the message
        obj.displayMsg();

        //------------------------------------------------------------------
        SingletonLazyInitialization obj2 = SingletonLazyInitialization.getInstance();
        obj2.displayMsg();

        //------------------------------------------------------------------
        SingletonThreadSafe obj3 = SingletonThreadSafe.getInstance();
        obj3.displayMsg();

        //------------------------------------------------------------------
        SingletonBillPugh obj4 = SingletonBillPugh.getInstance();
        obj4.displayMsg();

        SingletonEnum obj5 = SingletonEnum.Instance;



    }
}

