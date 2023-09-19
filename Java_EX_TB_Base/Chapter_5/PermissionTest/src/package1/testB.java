package package1;

class testAson2 extends testA{
	public void E() {
		System.out.println("testAson2子类继承OK");
	}
}

public class testB {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		testAson2 b=new testAson2();
		//变量
		System.out.println("a1="+b.a1);
		System.out.println("a2="+b.a2);
		System.out.println("a3="+b.a3);
//		System.out.println("a4="+b.a4);
		//方法
		b.A();
		b.B();
		b.C();
//		b.D();
		b.E();

	}

}
