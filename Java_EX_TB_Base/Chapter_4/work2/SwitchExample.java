package work2;

public class SwitchExample {
	private int grade;
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public int getGrade() {
		return this.grade;
	}
	public void grade() {
		switch (grade/10) {
			case 6:System.out.println(this.getGrade()+"分属于及格");
				break;
			case 7:
			case 8:System.out.println(this.getGrade()+"分属于良好");
				break;
			case 9:System.out.println(this.getGrade()+"分属于优秀");
				break;
			case 10:System.out.println(this.getGrade()+"分属于满分");
				break;
			default:System.out.println(this.getGrade()+"分属于不及格");
				break;
		}
	}

}

