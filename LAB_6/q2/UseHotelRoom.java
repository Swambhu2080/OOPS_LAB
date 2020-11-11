import java.util.*;

public class UseHotelRoom {
    public static void main(String []args){
           Scanner sc=new Scanner(System.in);
           int ch,rm;
        while(true){
            System.out.println("\n1.Normal\n2.Suite\n3.Exit\n");
            ch=sc.nextInt();
            if(ch==3)
                break;
            System.out.println("\nEnter Room No.\n");
            rm=sc.nextInt();
            if(ch==1)
            {
                HotelRoom ob1=new HotelRoom(rm);
                ob1.getValues();
            }
            else if(ch==2)
            {
                Suite ob2=new Suite(rm);  
                ob2.getValues();
            }        
        }
    }
}