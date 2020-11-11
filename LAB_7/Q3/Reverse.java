import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num<=0)
        System.out.println("Error : 0 or negative number not allowed !");
        else{
            int rev = 0;
            while(num!=0){
                int r = num%10;
                rev = rev * 10 + r;
                num/=10;                    
            }
            System.out.println("Reversed: " + rev);
        }        
    }    
}