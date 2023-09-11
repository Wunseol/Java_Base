package work1;

class ElseIf{
	private int month;
	private String season;
	public void setMonth(int month) {
		this.month=month;
	}
	public int getMonth() {
		return this.month;
	}
	
	public void judgeSeason() {
		if(month==12||month==1||month==2)
			season="Winter";
		else if(month==3||month==4||month==5)
			season="Spring";
		else if(month==6||month==7||month==8)
			season="Summer";
		else if(month==9||month==10||month==11)
			season="Autumn";
		else {
			season="no season ! ";
		}
		System.out.println("Month "+this.month+" belong to "+season);
	}
}

public class TestElself {

	public static void main(String[] args) {
		ElseIf ei=new ElseIf();
		ei.setMonth(4);
		ei.judgeSeason();
		ei.setMonth(13);
		ei.judgeSeason();

	}

}
