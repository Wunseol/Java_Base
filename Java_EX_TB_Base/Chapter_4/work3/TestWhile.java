package work3;

class WhileExample{
	private int startNum,sum,endNum;
	public void set(int startNum,int endNum) {
		this.startNum=startNum;
		this.endNum=endNum;
	}
	public void print() {
		System.out.println(this.startNum+" 到"+this.endNum+" 之间的连加和：");
		
	}
	public void whileEx() {
		while(startNum<=endNum) {
			sum+=startNum;
			startNum++;
		}
		System.out.println("sum="+sum+",最后计数器多运行一次，值为"+startNum);
		
	}
	
}

public class TestWhile {
	public static void main(String[] args) {
		WhileExample we=new WhileExample();
		we.set(1, 100);
		we.print();
		we.whileEx();
		
	}

}
