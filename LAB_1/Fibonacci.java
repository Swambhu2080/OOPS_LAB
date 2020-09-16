class Fibonacci{  
public static void main(String args[])  
{    
 int n1=0,n2=1,n3,i,a;    
 System.out.print(n1+" "+n2);
 a = Integer.parseInt(args[0]);
 for(i=2;i<a;++i)    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;    
 }    
  
}
} 