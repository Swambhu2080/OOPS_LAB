public class Triangle extends Shape{
	private double base=0.0;
	private double height=0.0;
	public Triangle(String color, double height, double base){
		this.setColor(color);
		this.height=height;
		this.base=base;
	}
	public Triangle(double height, double base){
		this.height=height;
		this.base=base;
	}
	public String show(){
		return "I am a Triangle of color "+this.getColor();
	}
	public double getArea(){
		return 0.5*this.base*this.height;
	}
	public int compareTo(Object other){
		if(this.getArea()==((Triangle)other).getArea()){
			System.out.println("Both are equal");
		}
		else if(this.getArea()>((Triangle)other).getArea()){
			System.out.println("1st triangle is larger");
		}
		else{
			System.out.println("2nd triangle is larger");
		}
		return 0;
	}
}