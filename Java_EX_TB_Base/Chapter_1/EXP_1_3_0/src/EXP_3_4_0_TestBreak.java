public class EXP_3_4_0_TestBreak {
    public static void main(String[] args) {
        int total = 0;
        while(true){
            total++;
            int i = (int)(Math.random()*100);
            System.out.println(i);
            if(i==88){
                break;
            }
        }
        System.out.println("循环次数："+total);
    }
}
