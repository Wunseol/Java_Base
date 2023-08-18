package EX3;

public class AssignOperator {
    public static void ass() {
        int a,b,c,m,n;
        a=b=c=5;
        System.out.println("a="+a+","+"b="+b+","+"c="+c);
        m=4;n=2;
        m+=m*=n-=m*n;
        System.out.println("m="+m);

    }
    public static void main(String args[]) {
        AssignOperator.ass();
    }
}
