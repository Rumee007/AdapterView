package com.example.mobileapp.adapterviewpb4;

/**
 * Created by Mobile App on 2/9/2018.
 */

public class Student {
    private String name;
    private int age;
    private int image;

    public Student(String name, int age, int image) {
        this.name = name;
        this.age = age;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getImage() {
        return image;
    }
}
