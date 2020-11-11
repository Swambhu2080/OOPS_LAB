import java.util.*;

class Pay{
  static double h, r, w, g, n;
 void computeNetPay(double h, double r,double w){
	g = h * r ;
	n = g - (w/100);
 } 
 void computeNetPay(double h, double r){
 	w = 15;
 	g = h * r ;
	n = g - (w/100);
 }
 void computeNetPay(double h){
	w =15;
 	r=5.85;
 	g = h * r ;
	n = g - (w/100);
 }
 public static void main(String[] args) {
 	 	Pay ob = new Pay();
 	 	Scanner sc =new Scanner(System.in);
 	 	System.out.println("Enter the hours worked, rate of pay per hour, withholding rate");
        h=sc.nextDouble();
        r=sc.nextDouble();
        w=sc.nextDouble();
        ob.computeNetPay(h,r,w); 
        ob.display();
        ob.computeNetPay(h,r);
        ob.display(); 
        ob.computeNetPay(h); 
        ob.display();
 }
 void display(){
	System.out.println("\nGross Amount is: " +g+" & Net Amount is : "+n+"\n"); 	
 }
}