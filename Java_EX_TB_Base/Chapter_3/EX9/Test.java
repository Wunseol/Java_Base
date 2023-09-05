package EX9;

class A{
    public String show(D obj){
        return ("A and D");
    }
    public String show(A obj){
        return ("A and A");
    }
    public String show(C obj){
        return ("A and C");
    }
}
class B extends A{
    public String show(B obj){
        return ("B and B");
    }
    public String show(A obj){
        return ("B and A");
    }
    public String show(C obj){
        return  ("B and C");
    }
}
class C extends B{}
class D extends B{}
public class Test {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println(a1.show(b));   //1
        System.out.println(a1.show(c));   //2
        System.out.println(a1.show(d));   //3
        System.out.println(a2.show(b));   //4
        System.out.println(a2.show(c));   //5
        System.out.println(a2.show(d));   //6
        System.out.println(b.show(b));    //7
        System.out.println(b.show(c));    //8
        System.out.println(b.show(d));
    }
}
