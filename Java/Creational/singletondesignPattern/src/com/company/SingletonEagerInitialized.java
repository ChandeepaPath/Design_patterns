package com.company;

public class SingletonEagerInitialized {
    //create an object of SingletonEagerInitialized
    private static SingletonEagerInitialized instance= new SingletonEagerInitialized();

    //constructor
    private SingletonEagerInitialized() {}

    //get the instance object
    public static SingletonEagerInitialized getInstance(){
        return instance;
    }
    public void displayMsg(){
        System.out.println("This is the Eager Initialization");
    }
}
