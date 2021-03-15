package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem {



    private LinkedList<Student> studentList ;
    private TreeSet<School>   schoolList;


    public Problem() { };

    public Set<School> getList() {
        return schoolList;
    }

    public void setList(TreeSet<School> list) {
        this.schoolList = list;
        schoolList.stream();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(LinkedList<Student> student_list) {
        this.studentList = student_list;
        studentList.stream();
       // this.stream = convertListToStream(student_list);
    }



    public void sortStudents()
    {

        Collections.sort(this.studentList,new MyStudentCompare());

    }

    @Override
    public String toString() {
        return "Problem{" +
                "studentList=" + studentList +
                ", schoolList=" + schoolList +
                '}';
    }



    public void printStudents (){
        System.out.println("Stream from StudentList: "
                + Arrays.toString(this.studentList.toArray()));
    }


}
