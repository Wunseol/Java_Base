package EX12;

class A{
    int i;
    public void getA(int i){
        System. out. println("i="+i);
    }
}
class B extends A {
    int i;

    public void getB(int i) {
        getA(1);
        System.out.println("i=" + i);
        System.out.println("i=" + i);
    }
}
class C extends B {
    int i;

    public void getC(int i) {
        getB(1);
        System.out.println("i=" + i);
    }

    public void getA(int i) {
        System.out.println("i=" + i);
        System.out.println("i=" + i);
    }

    public static void main(String args[]) {
        B c = new C();
//        A a = new C();
//        a.getA(1);
        c.getB(3);
    }
}
