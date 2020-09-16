public class ShapeManager{
	public static void main(String[] args){
		Triangle T=new Triangle(4.0,5.0);
		System.out.println(T.show()+"\nMy area is : "+T.getArea());
		Triangle t=new Triangle("Neon",8.0,10.0);
		System.out.println(t.show()+"\nMy area is : "+t.getArea());
		T.compareTo(t);
	}
}