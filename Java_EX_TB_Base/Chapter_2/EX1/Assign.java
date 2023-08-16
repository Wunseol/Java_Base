package EX1;

public class Assign {
    public static void assign() {   //以下变量在方法体内,属于局部变量,必须赋值
        int x,y;                    // 仅声明变量,后面赋值
        float z=3.214f;             //声明的同时并赋初始值
//        {
        double w=3.1415;
        boolean t=true;
//        }
        //w和t属于大括号的语句块中,出了大括号就消失,因此在下面的输出语句中不能输出
        // 解决方案:去掉这里的大括号或去掉下面输出语句中的w和t
        char c;
        c='A';                      //如果没有该语句,相当于c只声明而没有赋值,错误
        x=6;                        //错误,不能两次声明,去掉int
        y=1000;
        System.out.println(x+","+y+","+z+","+w+","+t+","+c);
    }
    public static void main(String args[]) {
        Assign.assign();
    }
}
