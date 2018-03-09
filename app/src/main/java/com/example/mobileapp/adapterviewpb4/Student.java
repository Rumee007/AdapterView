package com.example.mobileapp.adapterviewpb4;

import java.util.ArrayList;
import java.util.List;

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

    public static List<Student> generateStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("A", 22, R.drawable.movie));
        students.add(new Student("B", 23, R.drawable.movie));
        students.add(new Student("C", 24, R.drawable.movie));
        students.add(new Student("D", 25, R.drawable.movie));
        students.add(new Student("E", 26, R.drawable.movie));
        students.add(new Student("F", 27, R.drawable.movie));
        students.add(new Student("G", 26, R.drawable.movie));
        students.add(new Student("H", 29, R.drawable.movie));
        students.add(new Student("I", 22, R.drawable.movie));
        students.add(new Student("J", 23, R.drawable.movie));
        students.add(new Student("K", 24, R.drawable.movie));
        students.add(new Student("L", 45, R.drawable.movie));
        students.add(new Student("M", 26, R.drawable.movie));
        students.add(new Student("N", 29, R.drawable.movie));
        students.add(new Student("O", 20, R.drawable.movie));
        return students;
    }
}
