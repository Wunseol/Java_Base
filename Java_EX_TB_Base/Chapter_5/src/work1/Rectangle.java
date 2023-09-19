package work1;

public class Rectangle {
	double width,length,girth,area;
	public Rectangle() {};
	public Rectangle(double wd,double le)
	{
		width=wd;length=le;
	}
	public void setWidth(double wd) {
		width=wd;
	}
	public void setLength(double le) {
		length=le;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public double girth() {
		return 2*(width+length);
	}
	public double area() {
		return width*length;
	}
	public void printRectangle() {
		System.out.println("Width="+width+",length="+length);
	}
	public static void main(String args[]) {
		Rectangle re1=new Rectangle(10,20);
		Rectangle re2=new Rectangle();
		re2.setWidth(3);
		re2.setLength(4);
		re1.printRectangle();
		System.out.println("Girth="+re1.girth()+",Area="+re1.area());
		re2.printRectangle();
		System.out.println("Girth="+re2.girth()+",Area="+re2.area());
		
	}
	
	

	
}
