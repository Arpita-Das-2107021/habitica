public class Grade{
	private double marks;
	public Grade(double marks){ this.marks=marks; }
	public String getGrade(){
		if(marks>80){
			return 'A+';
		else if (marks>70)
			return "A";
		else return "A-";
		}
	}
}
