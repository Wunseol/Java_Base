package EX4;

class SuperClass {
    private int i = 1;
    int j = 2;
    int plus() {
        return i + j;
    }
}
class SubClass extends SuperClass {
    int i = 10, j = 20;
    int subduce() {
        return j - super.j;
    }
}
public class CopyOfTest {
    public static void main(String args[]) {
        SuperClass sup = new SuperClass();
        SubClass sub = new SubClass();
        SuperClass supsub = new SubClass();
//      System. out. println("sup.i="+sup.i);
        System.out.println("sup. plus()=" + sup.plus());
        System.out.println("sub. plus()=" + sub.plus());
        System.out.println("supsub. plus()=" + supsub.plus());
    }
}
