package com.company;

import java.util.*;
import java.util.stream.Stream;

public class School {
   private String name;
   private  Map<School, ArrayList<Student>> students = new LinkedHashMap<School, ArrayList<Student>>();


   public School () {}

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "School{" +
              "name='" + name + '\'' +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof School)) return false;
      School school = (School) o;
      return Objects.equals(getName(), school.getName());
   }

   public Map<School, ArrayList<Student>> getStudents() {
      return students;
   }

   public void setStudents(Map<School, ArrayList<Student>> students) {
      this.students = students;
   }
}
