import java.util.*;
class Main{
	public static void main(String[] args) {
		Student.setCllg("XZY");

		Student S1 = new Student("Walter");
		Student S2 = new Student("Jesse");	

		S1.getStudentInfo();
		S2.getStudentInfo();	
	}
}