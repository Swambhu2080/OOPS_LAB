import java.lang.Math;
class Amstrong{
	public static void main( String args[]){
	 int r,s=0,n;
	 int a = Integer.parseInt(args[0]);
	 n=a;
	 while(n!=0)
	 {
	 	r=n%10;
	 	s=s+(r*r*r);
	 	n=n/10;
	 }
	 if(a==s)
	 System.out.println("Amstrong");
	else
		System.out.println(" not Amstrong");
	}
}