package com.company;

public class Student {
    private String name;
    private String index;
    private int currentYear;
    private float cgpa;

    public Student(String name, String index, int currentYear, float cgpa) {
        this.name = name;
        this.index = index;
        this.currentYear = currentYear;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", index='" + index + '\'' +
                ", currentYear=" + currentYear +
                ", cgpa=" + cgpa +
                '}';
    }
}

