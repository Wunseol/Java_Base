package EX2;

public class Change {
    public static void main(String args[]) {
        StringBuffer a=new StringBuffer("ok");
        int i;
        i=5;
        System.out.println("Before change, a is "+a);
        change(a);
        System.out.println("After change a is "+a);
        System.out.println("Before change i is "+i);
        change(i);
        System.out.println("After change i is "+i);
    }
    public static void change(StringBuffer ia) {
        ia.append(" ok?");
    }
    public static void change(int li) {
        li=10;
    }
}
