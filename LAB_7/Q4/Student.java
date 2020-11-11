public class Student{
	String Name;
	int rollNo;
	static int counter=0;
	static String collegeName;
	public Student(String Name){
		this.Name=Name;
		this.rollNo=setRollNo();
	}
	static int setRollNo(){
		return ++counter;
	}
	static void setCllg(String name){
		collegeName=name;
	}
	void getStudentInfo(){
		System.out.println("\n\nRoll No.- "+this.rollNo+"\nStudent Name - "+this.Name+"\nCollege Name - "+this.collegeName);
	}
}