package Package2;

import Package1.TestA;

class TestC extends TestA{
    public static void main(String[] args) {
        TestC a=new TestC();
        //变量
        System.out.println("a1="+a.a1);
        System.out.println("a2="+a.a2);
//		System.out.println("a3="+a.a3);
//		System.out.println("a4="+a.a4);
        //方法
        a.A();
        a.B();
//		a.C();
//		a.D();
    }
}
