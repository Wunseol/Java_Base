package EX5;

public class CompareNumber {
    public static void compare() {
        int n=3;
        int m=4;
        System.out.println("n<m is "+(n<m));
        System.out.println("n=m is "+((++n)==m));
        System.out.println("n>m is "+((++n)>m));
        System.out.println("n is "+n);

    }
    public static void main(String[]args) {
        CompareNumber.compare();
    }

}