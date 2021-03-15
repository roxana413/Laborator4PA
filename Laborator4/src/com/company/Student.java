package com.company;

import java.util.*;
import java.util.stream.Stream;

public class Student {
    private String name;
    private  Map<Student, ArrayList<School>> schools = new HashMap<Student,ArrayList<School>>();



    public Student () {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public Map<Student, ArrayList<School>> getSchools() {
        return schools;
    }

    public void setSchools(Map<Student, ArrayList<School>> schools) {
        this.schools = schools;
    }
}
