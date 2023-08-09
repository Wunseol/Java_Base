/**
 * 测试于单分支结构
 * 写个掷骰子游戏
 *
 */
public class EXP_2_1_0_Test_if {

//    Math类的使用口 Math.randon()该方法用于产生0到1区间的 double类型的随机数
//    但是不包括1
//    int i=(int)(6*Math.random());//产生:[0,5]之间的随机整数
    public static void main(String[] args) {
        int i = (int)(Math.random()*6)+1;
        int j = (int)(Math.random()*6)+1;
        int k = (int)(Math.random()*6)+1;

        int count = i+j+k;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        if(count>15){
            System.out.println("今天手气不错！");
        }
        if(count>=10&&count<=15){
            System.out.println("手气一般");
        }
        if(count<10){
            System.out.println("手气不好");
        }

        System.out.println("得分："+count);

    }
}
