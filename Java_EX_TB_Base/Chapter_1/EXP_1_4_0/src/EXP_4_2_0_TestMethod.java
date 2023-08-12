public class EXP_4_2_0_TestMethod {
    public static void main(String[] args) {
        SayLoveU();
        int x=0;
        x=add(10,20,30);
        System.out.println(x);

    }
    public static void SayLoveU(){
        System.out.println("hi");
    }
    public static int add(int a,int b,int c){
        int sum = a+b+c;
        System.out.println("sum:"+sum);
        return sum;
    }
}
