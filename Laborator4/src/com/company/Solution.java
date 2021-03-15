package com.company;

import java.util.*;

public class Solution {

    private Problem prob;
    private Map<Student, ArrayList<School>> schools  = new HashMap<Student,ArrayList<School>>();
    private  Map<School, ArrayList<Student>> students = new LinkedHashMap<School, ArrayList<Student>>();
    private LinkedList<Student>             studentList ;
    private  TreeSet<School>                 schoolList;
    private  Map <Student,School> solution =new HashMap<Student,School>();



    public Problem getProb() {
        return prob;
    }

    public void setProb(Problem problem) {
        this.prob = problem;
    }

    public void SetSchools (TreeSet<School> schoolList)
    {
        this.schoolList=schoolList;
    }

    public void SetStudents(LinkedList<Student> studentList)
    {
        this.studentList=studentList;
    }

    public Map<Student, ArrayList<School>> getSchoolsMap() {
        return schools;
    }

    public void setSchoolsMap(Map<Student, ArrayList<School>> schools) {
        this.schools = schools;
    }

    public Map<School, ArrayList<Student>> getStudentsMap() {
        return students;
    }

    public void setStudentsMap(Map<School, ArrayList<Student>> students) {
        this.students = students;
    }

    public void solutionAlgo(Problem p )
    {

          for (Map.Entry<School,ArrayList<Student>> entry : students.entrySet())
              schools.forEach((key, value) -> {
                   if (entry.getValue().equals(key) && value.equals(entry.getKey()))
                   {
                       this.solution.put( key,entry.getKey());
                   }
              });

    }

    public Map<Student, School> getSolution() {
        return solution;
    }
}
