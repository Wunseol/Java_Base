package EX1;

public class person {
    private String name;
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return this.name;
    }
    public void print() {
        System.out.println("person's name is "+this.getName());
    }
}
