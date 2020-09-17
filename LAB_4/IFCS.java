import java.util.*;
class IFCS{
	String[] arr = new String[100];
	String[] arr1 = new String[100];
	String[] arr2 = new String[100];
	int i=0;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Boolean a=false,b=false,c=false;
		Scanner sc=new Scanner(System.in);
		 IFCS ob=new IFCS();
		 int n=1;
		 while(n==1){
		 	System.out.println("1.insert\n2.del\n3.check\n4.display");
			int ch=sc.nextInt();
				switch(ch){
					case 1:a = ob.insert();
							 if(a.equals(true))
							 	System.out.println("item inserted");
							break;
					case 2:    b = ob.remove();
		 						if(b.equals(true))
		 							System.out.println("item removed");
							break;
						case 3:c = ob.exists();
								 if(c.equals(true))
								 	System.out.println("item exists in lab");
							break;
					case 4: ob.display();
							break;
					default: System.out.println("Wrong input");
							 break; 
				
			}
			System.out.println("1.continue\n2.exit");
			int x=sc.nextInt();
			if(x==2)
				break;
		 }
	}
	public boolean insert(){
		String str="";
		String str1="";
		System.out.print("enter the id:");
		str=sc.nextLine();
		System.out.print("enter the  description:");
		str1=sc.nextLine();
		if("".equals(str)){
			System.out.println("Error - id cannot be NULL");
			return false;
		}
		else if("".equals(str1)){
			System.out.println("Error - description cannot be NULL");
			return false;
		}
		else{
			arr[i]=str;
			arr1[i]=str1;
			i++;
			sort();
			return true;
		}
	}
	public void sort(){
		String temp,temp1;
		for(int j=0;j<i-1;j++){
			for(int k=j+1;k<i;k++){
				if(arr[j].compareTo(arr[k]) > 0){
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;

					temp1=arr1[j];
					arr1[j]=arr1[k];
					arr1[k]=temp1;
				}
			}
		}
	}
	public boolean exists(){
		System.out.print("enter the id : ");
		String s=sc.nextLine();
		int f=0;
		if("".equals(s)){
			System.out.println("Error - id cannot be NULL");
		}
		else{
			for(int j=0;j<i;j++){
				if(s.equals(arr[j])){
					f=1;
				}
			}
			if(f==1)
				return true;
			else 
				System.out.println("item not found");
		}
		return false;
	}
	public boolean remove(){
		if(i==0){
			System.out.println("Error - Nothing to remove");
		}
		else{
		System.out.print("enter the id : ");
		String s=sc.nextLine();
		int f=0,a=0,b=0,z=0;
		if("".equals(s)){
			System.out.println("Error - id cannot be NULL");
		}
		else{
			for(int j=0;j<i;j++){
				if(s.equals(arr[j])){
					f=1;
					a=j;
				}
			}
			if(f==1){
				for(int k=0;k<i;k++) {
					if(k!=a){
					arr[b++]=arr[k];
					arr1[z++]=arr1[k];
				}
			}
			i--;
			return true;
		}
		else 
			System.out.println("item not found");
		}
		}
		return false;	
	}
	public void display(){
		for(int j=0;j<i;j++){
			System.out.println(arr[j]+" "+arr1[j]);
		}
	}
}
