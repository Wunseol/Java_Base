import java.util.Scanner;

public class EXP_4_1_0_SalaryCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("**************我的薪水计算器***************");
        System.out.println("1.输入88,退出程序\n2.输入66,计算下一年薪水");

        while(true){
            System.out.println("请输入月薪:");
            int monthSalary = s.nextInt();
            System.out.println("请输入几个月薪:");
            int months = s.nextInt();
            int yearsSalary = monthSalary*months;

            System.out.println("年薪是:"+yearsSalary);
            if(yearsSalary>=200000){
                System.out.println("超过98%的人");
            }else if(yearsSalary>=100000){
                System.out.println("超过90%的人");
            }
            System.out.println("1.输入88,退出程序\n2.输入66,计算下一年薪水");
            int comm = s.nextInt();
            if(comm==88){
                System.out.println("系统退出");
                break;
            }
            if(comm==66){
                System.out.println("继续计算");
                continue;
            }

        }
    }
}
