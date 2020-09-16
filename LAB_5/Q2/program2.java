public class program2 {
    public static void main(String[] args) {
    	String name="Swambhu";
        Person p=new Person(name);
        Student s=new Student(name);
        CSEStudent c=new CSEStudent(name);
       	p.Introduce();
       	s.Introduce();
       	c.Introduce();
    }   
}