package com.company;

public class SingletonBillPugh {
    private static SingletonBillPugh instance;

    private SingletonBillPugh(){}

    private static class SingletonInner{
        private static final SingletonBillPugh instance = new SingletonBillPugh();
    }
    public static SingletonBillPugh getInstance(){
        return SingletonInner.instance;
    }

    public void displayMsg(){
        System.out.println("This is Bill Pugh Singleton Method");
    }
}


