package com.company;

import java.util.*;

public class Main {

    private static Object List;
    private static Object Student;

    public static void main(String[] args) {


        Problem p1 = new Problem ();
        LinkedList <Student> studentList = new LinkedList<>();


        Student S0 = new Student();
        S0.setName("S0");

        Student S1 = new Student();
        S1.setName("S1");

        Student S2 = new Student();
        S2.setName("S2");

        Student S3 = new Student();
        S3.setName("S3");


        studentList.add(S1);
        studentList.add(S3);
        studentList.add(S0);
        studentList.add(S2);
        p1.setStudentList( studentList );
        p1.sortStudents();

        TreeSet<School> schools = new TreeSet<School>(new MySchoolCompare());
        School H1 = new School();
        H1.setName("H1");

        School H2 = new School();
        H2.setName("H2");

        School H0 = new School();
        H0.setName("H0");

        schools.add(H0);
        schools.add(H1);
        schools.add(H2);
        p1.setList( schools );

        Map<Student, ArrayList<School>> s0 = new HashMap<Student,ArrayList<School>>();
        ArrayList<School> sch0 =new ArrayList<>();
        sch0.add(H0);
        sch0.add(H1);
        sch0.add(H2);
        s0.put(S0,sch0);
        S0.setSchools(s0);


        Map<Student, ArrayList<School>> s1 = new HashMap<>();
        ArrayList<School> sch1 =new ArrayList<>();
        sch1.add(H0);
        sch1.add(H1);
        sch1.add(H2);
        s1.put(S1,sch1); //formam map-ul

        S1.setSchools(s1); //initializam

        Map<Student, ArrayList<School>> s2 = new HashMap<>();
        ArrayList<School> sch2 =new ArrayList<>();
        //cream vectorul de scoli
        sch2.add(H0);
        sch2.add(H1);


        s2.put(S2,sch2); //formam map-ul

        S2.setSchools(s2); //initializam


        Map<Student, ArrayList<School>> s3 = new HashMap<>();
        ArrayList<School> sch3 =new ArrayList<>();
        //cream vectorul de scoli
        sch3.add(H0);
        sch3.add(H2);


        s3.put(S3,sch2); //formam map-ul

        S3.setSchools(s3); //initializam



        Map<School, ArrayList<Student>> h0= new HashMap<>();
        ArrayList<Student> std0 =new ArrayList<>();
        //cream vectorul de scoli
        std0.add(S3);
        std0.add(S0);
        std0.add(S1);
        std0.add(S2);


        h0.put(H0,std0); //formam map-ul

        H0.setStudents(h0); //initializam



        Map<School, ArrayList<Student>> h1= new HashMap<>();
        ArrayList<Student> std1 =new ArrayList<>();
        //cream vectorul de scoli
        std1.add(S0);
        std1.add(S2);
        std1.add(S1);



        h1.put(H1,std1); //formam map-ul

        H1.setStudents(h1); //initializam


        Map<School, ArrayList<Student>> h2= new HashMap<>();
        ArrayList<Student> std2 =new ArrayList<>();
        //cream vectorul de scoli
        std2.add(S0);
        std2.add(S1);
        std2.add(S3);



        h2.put(H2,std2); //formam map-ul

        H2.setStudents(h2); //initializam

        for (Student s : studentList)
            System.out.println(s.getSchools());

        for (School h : schools)
            System.out.println(h.getStudents());


        System.out.println(p1);

        Solution s=new Solution();
        s.setProb(p1);
        s.setSchoolsMap(s0);
        s.setStudentsMap(h0);
        s.solutionAlgo(p1);
        System.out.println(s.getSolution());







    }



}
