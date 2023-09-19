package test1;

class A{
	public String show(D obj) {
		return ("A and D");
	}
	public String show(A obj) {
		return ("A and A");
	}
	public String show(C obj) {
		return ("A and c");
	}
	
}
class B extends A{
	public String show(B obj) {
		return ("B and B");
	}
	public String show(A obj) {
		return ("B and A");
	}
	public String show(C obj) {
		return ("B and C");
	}
}
class C extends B{}
class D extends B{}

public class testA {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		A a1=new A();
		A a2=new B();
		B b=new B();
		C c=new C();
		D d=new D();
		System.out.println(a1.show(b));
		System.out.println(a1.show(c));
		System.out.println(a1.show(d));
		System.out.println(a1.show(b));
		System.out.println(a2.show(b));
		System.out.println(a2.show(c));
		System.out.println(a1.show(d));
		System.out.println(b.show(b));
		System.out.println(b.show(c));
		System.out.println(b.show(d));
		System.out.println(a2.show(b));
		System.out.println(a2.show(c));
		System.out.println(a2.show(d));
		System.out.println(a2.show(b));
	}

}
