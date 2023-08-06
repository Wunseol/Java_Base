public class EXP_8_0_TestOperator04 {
    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~b);

        //移位
        //乘以2,除以2,使用移位操作,最快!!
        int c = 5<<2;       //相当于:5*2*2
        System.out.println(c);
        System.out.println(40>>3);      //相当于:40/8

    }
}
