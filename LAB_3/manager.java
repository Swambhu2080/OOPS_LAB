import java.util.*;

public class manager{

	static Scanner sc = new Scanner(System.in);
	int[] array = new int[11];
	public static void main(String[] args){
		int ch, num;
		manager m=new manager();
		do
		  {
			System.out.println("Perform the following methods:\n1: Initialize\n2: Insert\n3: Remove\n4: Display\n5: Quit");
			System.out.print("Enter your choice: ");
			ch = sc.nextInt();
			switch(ch){
				case 1: m.initialize();
						break;
				case 2: System.out.println("Enter the number to enter: ");
						num = sc.nextInt();
						m.insert(num);
						break;
				case 3: System.out.println("Enter the number to remove: ");
						num = sc.nextInt();
						m.remove(num);
						break;
				case 4: m.display();
						break;
				default: System.out.println("wrong input");
						 break;
			}
		}while(ch!=5);
	}

	void initialize(){
		System.out.println("Enter number of elements");
		array[0] = sc.nextInt();
		for (int i=1; i<=array[0]; i++)
			array[i] = sc.nextInt();
		Arrays.sort(array,1,array[0]+1);
	}

	void insert(int num){
		if (array[0]==10)
			System.out.println("The array Overload.");
		else{
			array[0] = array[0]+1;
			array[array[0]] = num;
		}

		Arrays.sort(array,1,array[0]+1);
	}

	void display(){
		for (int i=1; i<=array[0]; i++){
			System.out.println(array[i]);
		}
	}

	void remove(int num){
		int b=1,f=0,a=0;
		if(array[0]==0)
			System.out.println("The array is empty");
		else{
			for(int i=1; i<=array[0]; i++){
				if(array[i]==num){
					f=1;
					a=i;
					break;
				}
			}
			if(f==1){
				for(int i=1;i<=array[0]; i++)
					{
						if(i!=a)
							array[b++] = array[i];
					}
			array[0] = array[0]-1;
			}
			else{
				System.out.println("Element not present.");
			}
			
		}
	}
}