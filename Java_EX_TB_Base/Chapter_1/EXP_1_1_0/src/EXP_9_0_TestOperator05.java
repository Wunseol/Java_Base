public class EXP_9_0_TestOperator05 {
    public static void main(String[] args) {
        String a = "3";
        int b = 4;
        System.out.println(a+b);


        char c1 = 'h';
        char c2 = 'i';
        System.out.println(c1+c2);      //条件是string,不是char。若是char,则仍然是加法
        System.out.println(""+c1+c2);      //通过加空字符串,让整个+都变成连接符

    }
}
