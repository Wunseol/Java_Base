package EX3.Package2;

import EX3.Package1.SuperClass;

public class Subclass2 extends SuperClass {
    void limit() {
        j++;
        super.j++;
        SuperClass.j1--;
        j1++;
        SuperClass.m--;
    }
    public static void main(String args[]) {
        SuperClass sup=new SuperClass();
        //System.out.println(sup.j++);
        System.out.println(sup.j1++);
    }
}

