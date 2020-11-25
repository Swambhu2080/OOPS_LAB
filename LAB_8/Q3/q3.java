import java.util.*;
class q3{
	static ArrayList<Integer> result=new ArrayList<Integer>();
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 ArrayList<Integer> list1=new ArrayList<Integer>();
		 ArrayList<Integer> list2=new ArrayList<Integer>();
		 while(true){
		 	System.out.println("enter the nos. of list 1");
		 	int n=sc.nextInt();
		 	list1.add(n);
		 	System.out.println("0/1");
		 	int c = sc.nextInt();
		 	if(c==0)
		 		break;
		 }
		  while(true){
		 	System.out.println("enter the nos. of list 2");
		 	int n=sc.nextInt();
		 	list2.add(n);
		 	System.out.println("0/1");
		 	int c = sc.nextInt();
		 	if(c==0)
		 		break;
		 }
		 addList(list1,list2);
		 System.out.println(result);
	}
	static List<Integer> addList(List<Integer> lst1, List<Integer> lst2){
		for(int i=0;i<lst1.size(); i++){
			result.add(lst1.get(i) + lst2.get(i));
		}
		return result;
	}

}