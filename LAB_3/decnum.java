import java.util.*; 
import java.lang.*;
class decnum{
  public static void main(String[] args) {
    int j;  
    Double arr[] = new Double[];
    for(j=0;j<4;j++)
      {
        arr[i]=Double.parseDouble(args[i]);
      }
    Arrays.sort(arr);
    for(j=0;j<4;j++)
      {
        String str = String.format("%.2f", arr[j]); 
        System.out.println(" "+str);
      }
     String str1 = String.format("%.2f", Double.sum(Double.sum(a,b), Double.sum(c,d)));
     System.out.println("the Sum of the inputs is : "+str1);
  }
}