package com.company;

public class StudentBuilder {
    private String name;
    private String index;
    private int currentYear;
    private float cgpa;

    public StudentBuilder setIndex(String index) {
        this.index = index;
        return  this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return  this;
    }

    public StudentBuilder setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
        return  this;
    }

    public StudentBuilder setCgpa(float cgpa) {
        this.cgpa = cgpa;
        return  this;
    }

    public Student getStudent(){
        return new Student(name,index,currentYear,cgpa);
    }

}
