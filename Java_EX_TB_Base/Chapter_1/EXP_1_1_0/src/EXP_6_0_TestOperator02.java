public class EXP_6_0_TestOperator02 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        a += b;     //相当于:a=a+b
        System.out.println(a);

        a = 3;
        a *= b+3;       //相当于:a=a*(b+3)
        System.out.println(a);


    }
}
