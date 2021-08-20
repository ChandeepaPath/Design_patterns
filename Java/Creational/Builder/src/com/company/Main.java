package com.company;

public class Main {

    public static void main(String[] args) {
        //Noraml way
        Student stu =  new Student("chandeepa","184116R",3, (float) 3.86);

        //Using builder pattern
        Student st =  new StudentBuilder().setIndex("184116R").setName("W.P.C.P. Pathirana").getStudent();
        System.out.println(st);
        System.out.println(stu);

    }
}

