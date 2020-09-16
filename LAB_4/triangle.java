import java.util.*;
class triangle
{
	int height,base;
	triangle() 
	{
		base=0;
		height=0;
	}
	triangle(int b, int h){
		height=h;
		base=b;
	}
	void Show(double a){
		System.out.println("the area is : "+a);
	}
	double GetArea(){
		double a= 0.5*(height*base);
		return a;
	}
	void Comparison(triangle ob, triangle ob1){
		if(ob.GetArea()==ob1.GetArea()){
			System.out.println("t1 and t2 are equal");
		}
		else if(ob.GetArea()>ob1.GetArea()){
			System.out.println("t1 is larger");
		}
		else{
			System.out.println("t2 is larger");
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the base and height :  ");
		int b=sc.nextInt();
		int h=sc.nextInt();
		triangle ob=new triangle(b,h);
		if(h<=0 || b<=0)
			System.out.println("Error - base / height cannot be 0 or negative");
		else{
			System.out.println("1.to find area\n2.to compare");
			int ch=sc.nextInt();
			switch(ch){

			case 1: double a =ob.GetArea();
					ob.Show(a);
					break;
			case 2: a =ob.GetArea();
					System.out.println("enter the base and height of 2nd triangle");
					b=sc.nextInt();
				 	h=sc.nextInt();
				 	if(h>0 && b>0){
				 	triangle ob1=new triangle(b,h);	
				 	ob.Comparison(ob,ob1);
				 	}
				 	else{
				 		System.out.println("Error - base / height cannot be 0 or negative");
				 	}
					break;
			default: System.out.println("Wrong input");
					break;
			}
			
		}
	}
}