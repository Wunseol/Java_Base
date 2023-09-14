package work4;

public class DoWhileEx {
	private int startNum,sum,endNum;
	public void set(int startNum,int endNum) {
		this.startNum=startNum;
		this.endNum=endNum;
	}
	public void doWhileEx() {
		do {
			if(startNum%3==0)
				System.out.println(startNum);
			startNum++;
		}while(startNum<=endNum);
	}

}
