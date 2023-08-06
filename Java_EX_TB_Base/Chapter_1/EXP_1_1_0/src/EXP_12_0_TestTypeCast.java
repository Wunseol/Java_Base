public class EXP_12_0_TestTypeCast {
    public static void main(String[] args) {
        double a = 3.952134;
        int b = (int)a;     //结果:3浮点数强转为整数,直接丢失小数部分
        System.out.println(b);

        int c = 97;
        char d = (char)c;
        System.out.println(d);

        byte e = (byte)300;
        System.out.println(e);      //强制转型,超过了表数范围,则会转成一个完全不同的值

        //强制转型,超过了表数范围,则会转成一个完全不同的值
        int money = 1000000000;
        int years = 20;
        int total = money * years;
        System.out.println("total = "+total);       //返回的total是负数,超过了int的范围
        long total1 = money*years;
        System.out.println("total1 = "+total1);     //返回的total1仍然是负数。默认是int,因此结果会转成int值,再转成long
//        long total2 = money * years;
        long total2 = 1L*money * years;     //返回的tota12正确:先将一个因子变成1onq,整个表达式发生提升
        System.out.println("total2 = "+total2);

    }
}
