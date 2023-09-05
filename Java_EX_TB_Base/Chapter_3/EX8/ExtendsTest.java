package EX8;

public class ExtendsTest{
    public static void main(String[] args){
        B b=new B(0);
        int y=b.getY();
        System.out.println("y = "+y);
    }
}
class C {
    public static int x = 2;
    private int y = 2;
    protected int z;

    C() {
        x = x + 1;
        showX();
    }

    public void showX() {
        System.out.println("C.x="+x);
    }

    public int getY() {
        return y;
    }
}
class B extends C {
    B(int x) {
        x = x + 2;
        showX();
    }

    public void showX() {
        System.out.println("B.x="+x);
    }

    public int getY() {
        System.out.println("B.y=" + (super.getY()+x));
        return super.getY() + x;
    }
}
