public class EXP_2_2_0_Test_if {
    public static void main(String[] args) {
        double r = 4*Math.random();
        double area = 3.14*r*r;
        double circle = 2*Math.PI*r;

        System.out.println("半径："+r);
        System.out.println("面积："+area);
        System.out.println("周长："+circle);

        if(area>=circle){
            System.out.println("面积的数值大于等于周长！");
        }else{
            System.out.println("面积的数值小于周长！");
        }
        //条件运算符
        int a = 3,b = 4;
        int c = a<b?b:a;//返回较大的数
        System.out.println(c);
        if(a<b){
            c = b;
        }else{
            c = a;
        }
        System.out.println(c);

    }
}
