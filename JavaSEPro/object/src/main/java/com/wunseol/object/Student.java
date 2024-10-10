package com.wunseol.object;

public class Student {
    String name;
    double chinese;
    double math;


    public Student(){

    }

    public Student(String name, double chinese, double math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public static void printAverage(Student student){
        System.out.println(( student.chinese + student.math) / 2);
    }
    public static void printSum(Student student){
        System.out.println((student.chinese + student.math));
    }

    public void printThisName(){
        System.out.println(this.name);
    }

}
