public class EXP_2_0_TestFloatNumber {
    public static void main(String[] args) {
        double d1 = 3.14;
        double d2 = 3.14E2;       //科学技术法
        float f1 = 1.65F;       //浮点常量的默认类型是 double,改float需要后面加F

        //浮点数是不精确的,尽量不要直接比较

        float f2 = 0.1f;
        double d3 = 1.0/10;


        System.out.println(f2==d3);     //一个=是赋值;两个==是比较
        float f4 = 2342342342L;
        float f5 = f4+1;
        System.out.println(f4==f5);
        System.out.println(d2);

    }
}
