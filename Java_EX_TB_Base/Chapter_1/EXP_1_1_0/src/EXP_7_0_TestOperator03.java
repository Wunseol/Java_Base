public class EXP_7_0_TestOperator03 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        boolean c = a>b;
        System.out.println(c);
        char d = 'h';
        System.out.println((int)d);     //char值位于0~65536之间,可以通过(int)强制转型成数字
        boolean e = d>100;
        System.out.println(e);
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1&b2);      // 与:有false果: false
        System.out.println(b1|b2);      // 或:有一个tue,结果:true
        System.out.println(!b2);        // 取反
        System.out.println(b1^b2);      // 异或:相同 false,不同true
        // 短路与、短路或 && ||
        // int b3=3/0;
        // 会报不能除以0的异常
        boolean b3 = 1>2 && (4<3/0);
        System.out.println(b3);

    }
}
