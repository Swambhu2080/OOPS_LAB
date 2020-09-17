import java.util.*; 
import java.lang.*;
class decnum{
  public static void main(String[] args) {
    int j;  
    Double arr[] = new Double[4];
    for(j=0;j<4;j++)
      {
        arr[j]=Double.parseDouble(args[j]);
      }
    Arrays.sort(arr);
    for(j=0;j<4;j++)
      {
        String str = String.format("%.2f", arr[j]); 
        System.out.println(" "+str);
      }
     String str1 = String.format("%.2f", Double.sum(Double.sum(arr[0],arr[1]), Double.sum(arr[2],arr[3])));
     System.out.println("the Sum of the inputs is : "+str1);
  }
}
