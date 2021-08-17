package com.company;

public class SingletonLazyInitialization {
    private  static SingletonLazyInitialization instance;

    private SingletonLazyInitialization() { }

    public static SingletonLazyInitialization getInstance(){
        if(instance== null){
            instance =  new SingletonLazyInitialization();
        }
        return instance;
    }

    public void displayMsg(){
        System.out.println("This is the Lazy Initialization");
    }

}
