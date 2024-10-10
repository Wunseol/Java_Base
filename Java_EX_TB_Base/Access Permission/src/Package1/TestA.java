package Package1;

public class TestA {
    //变量
    public int a1=1;
    protected int a2=2;
    int a3=3;
    private final int a4=4;
    //final 在 Java 中是一个保留的关键字，可以声明成员变量、方法、类以及本地变量。
    // 一旦你将引用声明作 final，你将不能改变这个引用了，编译器会检查代码，
    // 如果试图将变量再次初始化的话，编译器会报编译错误。

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
        // TODO 自动生成的方法存根
        TestA a=new TestA();
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
