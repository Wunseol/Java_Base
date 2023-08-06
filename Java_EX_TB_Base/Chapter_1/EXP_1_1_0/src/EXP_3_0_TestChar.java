public class EXP_3_0_TestChar {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '中';
        char c3 = '\u0061';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
            //Java中字符串不是基本数据类型,而是一个类
        String str = "我爱中国";
        System.out.println(str);

        //转义字符
        char c5 = '\n';
        System.out.println("a\n\"b\"\nc\n");
        System.out.println("o\tp\t");

    }
}
