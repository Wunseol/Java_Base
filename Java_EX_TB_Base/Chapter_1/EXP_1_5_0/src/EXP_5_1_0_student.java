public class EXP_5_1_0_student {
    int id;
    int age;
    String sname;

    public void study(){
        System.out.println("正在学习");
    }

    public void kickball(){
        System.out.println("踢球");
    }

    public static void main(String[] args) {
        EXP_5_1_0_student s1 = new EXP_5_1_0_student();
        System.out.println(s1.id);
        System.out.println(s1.sname);
        s1.id=1001;
        s1.sname="小明";
        System.out.println(s1.id);
        System.out.println(s1.sname);
        s1.study();
        s1.kickball();

    }

}
