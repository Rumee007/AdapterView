package com.example.mobileapp.adapterviewpb4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mobile App on 2/9/2018.
 */

public final class CountryListGenerator {
    public static List<String> generateCountries(){
        List<String> countries = new ArrayList<>();
        countries.add("Australia");
        countries.add("Bangladesh");
        countries.add("Canada");
        countries.add("Denmark");
        countries.add("England");
        countries.add("Greece");
        countries.add("Honduras");
        countries.add("Italy");
        countries.add("Japan");
        countries.add("Korea");
        countries.add("Maldives");
        countries.add("Norway");
        countries.add("Oman");
        countries.add("Poland");
        countries.add("Qatar");
        countries.add("South Africa");
        return countries;
    }
    public static class StudentListGenerator{
        public static List<Student>generateStudents(){
            List<Student>students = new ArrayList<>();
            students.add(new Student("abc",20,R.drawable.movie));
            students.add(new Student("abc",20,R.drawable.movie));
            students.add(new Student("Abbas",20,R.drawable.movie));
            students.add(new Student("abc",20,R.drawable.movie));
            students.add(new Student("abc",22,R.drawable.movie));
            students.add(new Student("abc",20,R.drawable.movie));
            students.add(new Student("abc",20,R.drawable.movie));
            students.add(new Student("Harun",20,R.drawable.movie));
            students.add(new Student("abc",21,R.drawable.movie));
            students.add(new Student("abc",20,R.drawable.movie));
            students.add(new Student("Mashrafi",20,R.drawable.movie));
            students.add(new Student("abc",40,R.drawable.movie));
            students.add(new Student("abc",20,R.drawable.movie));
            students.add(new Student("Sabbir",29,R.drawable.movie));
            students.add(new Student("abc",20,R.drawable.movie));
            return students;
        }
    }

}
