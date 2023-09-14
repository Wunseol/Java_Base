package work5;

public class BreakContinue {

	public static void main(String[] args) {
		int i;
		int j;
		for(i=1;i<3;i++) {
			for(j=1;j<3;j++)
				System.out.println("i="+i+"j="+j);
		}
		System.out.println("----------");
		loop2:
			for(i=1;i<3;i++) {
				for(j=1;j<3;j++) {
					if(j==2)
						break loop2;
					System.out.println("i="+i+"j="+j);
				}
			}
		System.out.println("----------");
		loop3:
			for(i=1;i<3;i++) {
				for(j=1;j<3;j++) {
					if(j==2)
						continue loop3;
					System.out.println("i="+i+"j="+j);
				}
			}

	}

}
