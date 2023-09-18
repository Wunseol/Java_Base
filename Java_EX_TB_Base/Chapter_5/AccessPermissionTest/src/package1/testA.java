package package1;

public class testA {
	//变量
	public int a1=1;
	protected int a2=2;
	int a3=3;
	private int a4=4;
	//方法
	public void A() {
		System.out.println("方法 public void A()可以访问");
	}
	protected void B() {
		System.out.println("方法 protected void B()可以访问");
	}
	void C() {
		System.out.println("方法 void C()可以访问");
	}
	private void D() {
		System.out.println("方法 private void D()可以访问");
	}
	public static void main(String[] args) {

		testA a=new testA();
		//变量
		System.out.println("a1="+a.a1);
		System.out.println("a2="+a.a2);
		System.out.println("a3="+a.a3);
		System.out.println("a4="+a.a4);
		//方法
		a.A();
		a.B();
		a.C();
		a.D();
	}
}
