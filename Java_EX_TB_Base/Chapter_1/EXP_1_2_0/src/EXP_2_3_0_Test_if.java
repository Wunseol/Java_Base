public class EXP_2_3_0_Test_if {
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
        } else if (count>=10&&count<=15){
            System.out.println("手气一般");
        } else {
            System.out.println("手气不好");
        }
        System.out.println("得分："+count);

    }
}
