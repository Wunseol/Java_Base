package EX7;


class Father {
    private String name = "FATHER";
    private int i = 1;

    public Father() {
        System.out.println("********F*********");//
        whoAmI();
        tellName(name);
        tellValue(i);
    }

    public void whoAmI() {
        System.out.println("Father says,I am " + name + ", i=" + i);
    }

    public void tellName(String name) {
        System.out.println("Father's name is" + name + ", i=" + i);
    }

    public void tellValue(int i) {
        System.out.println("Father's name is" + name + ",i=" + i);
    }
}
class Son extends Father {
    private String name = "SON";
    private int i = 2;

    public Son() {
        System.out.println("********S*********");//
        whoAmI();
        tellName(name);
        tellValue(i);
    }

    public void whoAmI() {
        System.out.println("Son says, I am " + name + ", i=" + i);
    }

    public void tellName(String name) {
        System.out.println("Son's name is " + name + ", i=" + i);
    }

    public void tellValue(int i) {
        System.out.println("Father's name is " + name + ", i=" + i);
    }
}
public class NewDemo {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f);
        Son s= new Son();
        System.out.println(s);

    }
}
