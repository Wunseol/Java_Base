public class EXP_3_5_0_TestContinue {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 100; i < 150; i++){
            if(i%3==0){     //能被3整除的不要输出
                continue;
            }
            System.out.print(i+",");
            count++;
            if(count==5){
                System.out.println();//换行
                count=0;
            }
        }
    }
}
