public class EXP_2_4_0_TestSwitch {
    public static void main(String[] args) {
        int grade = (int)(Math.random()*4)+1;
        switch (grade){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("4");
                break;
        }
    }
}
