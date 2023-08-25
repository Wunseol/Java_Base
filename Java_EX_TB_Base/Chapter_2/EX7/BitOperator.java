package EX7;

public class BitOperator {
    public static void bitOperator() {
        int x=3;
        int y=5;
        int z=0;
        z=~x;
        System.out.println("z ="+z);    //z =-4
        z=x&y;
        System.out.println("z ="+z);    //z =1
        z=x^y;
        System.out.println("z ="+z);    //z =6

    }
    public static void main(String args[]){
        BitOperator.bitOperator();
    }
}
