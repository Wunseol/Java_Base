package package2;

import package1.testA;

class testC extends testA{

	public static void main(String[] args) {

		testC a=new testC();
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
