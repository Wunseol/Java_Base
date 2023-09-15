package work6;

public class TestResursion {
	public static void main(String[] args) {
		Recursion re=new Recursion();
		int result=re.f(10);
		re.setN(10);
		System.out.println(re.getN()+"的阶乘="+result);
	}

}
