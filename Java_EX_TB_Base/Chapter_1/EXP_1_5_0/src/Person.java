public class Person {
    String name;
    int age;
    public void show(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "张三";
        p1.show();
        Person p2 = new Person();

        Person p3 = p1;

        p3.age = 80;
        System.out.println(p1.age);
    }
}
