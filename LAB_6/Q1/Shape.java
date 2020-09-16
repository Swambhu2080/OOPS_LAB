public abstract class Shape{
	private String color="Green";
	boolean setColor( String color){
		this.color=color;
		return true;
	}
	public String getColor(){
		return this.color;
	}
	public abstract String show();
	public abstract double getArea();
}