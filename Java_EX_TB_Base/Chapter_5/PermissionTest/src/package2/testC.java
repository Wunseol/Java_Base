package package2;

import package1.testA;

//class testAson3 extends testA{
//	public void E() {
//		System.out.println("testAson3子类继承OK");
//	}
//}

class testC extends testA{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		testC c=new testC();
		//变量
		System.out.println("a1="+c.a1);
		System.out.println("a2="+c.a2);
//		System.out.println("a3="+c.a3);
//		System.out.println("a4="+c.a4);
		//方法
		c.A();
		c.B();
//		c.C();
//		c.D();
//		c.E();

	}

}
