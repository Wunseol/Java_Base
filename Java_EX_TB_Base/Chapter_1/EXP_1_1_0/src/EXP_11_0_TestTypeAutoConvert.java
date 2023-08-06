public class EXP_11_0_TestTypeAutoConvert {
    public static void main(String[] args) {
        int a = 2345;
        long b = 1;
//        int c = b;        //1ong类型不能自动转化成int
        double d = b;
        float f = b;

        byte h1 = 123;
//        byte h2 = 1234;     //1234超过了byte的表数范围
        char h3 = 97 + 25;
        System.out.println(h3);

    }
}
