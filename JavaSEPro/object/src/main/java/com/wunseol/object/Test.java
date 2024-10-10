package com.wunseol.object;


import com.wunseol.object.bag.hello;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.chinese = 100;
        s1.math = 90;
        s1.printSum(s1);
        s1.printAverage(s1);
        s1.printThisName();

        Student s2 = new Student("李四",100,90);
        s2.printThisName();
        s2.printSum(s2);
        s2.printAverage(s2);


        Teacher t = new Teacher();




        hello hello = new hello();
        hello.hello1();



    }
}
