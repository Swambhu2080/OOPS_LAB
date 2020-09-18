import java.util.Scanner;

public class IFCS{

    private Equipment[] eqpList;
    private int l;

    public static void main(String[] args) {
    	int ch;
        Scanner sc = new Scanner(System.in);
        IFCS myMgr = new IFCS();

        do{
            System.out.println("1. Insert\n2. Del\n3. Check\n4. Display\n5. Quit:\n");
            System.out.print("Enter your choice:");
            ch = sc.nextInt();
            switch(ch){
                case 1: {
                		System.out.print("Enter id:");
                    	String id = sc.next();
                    	System.out.print("Enter description:");
                    	String desc = sc.next();
                    	if(myMgr.insert(new Equipment(id, desc)))
                        	System.out.println("Equipment added ");
                    	else
                        	System.out.println("Equipment cannot be added");
                    	}break;
                case 2: {
                		System.out.print("Enter id:");
                    	String id = sc.next();
                    	if(myMgr.remove(id))
                        	System.out.println("Equipment removed ");
                    	else
                        	System.out.println("Equipment with id: "+id+" does not exists.");
                    	}break;
                case 3:{
	                    System.out.print("Enter id:");
	                    String id = sc.next();
	                    if(myMgr.find(id))
	                        System.out.println("Equipment exists in Lab");
	                    else
	                        System.out.println("Equipment does not exists in Lab");
	                	}break;
                case 4: myMgr.display();
                	 	break;
                default: System.out.println("Invalid Choice");
                		 break;
            }
        }while(ch!=5);
    }
    public IFCS() {
        eqpList = new Equipment[100];
        l = 0;
    }
    public boolean insert(Equipment eqp) {

        if(eqp.id.equals("null")){
            System.out.println("Error - id cannot be null");
            return false;
        }

        if(eqp.desc.equals("null")){
            System.out.println("Error - description cannot be null");
            return false;
        }

        if(l + 1 < 100){
            eqpList[l] = eqp;
            l++;
            sort();
            return true;
        }

        return false;
    }
    public void sort(){
		String temp,temp1;
		for(int j=0;j<l-1;j++){
			for(int k=j+1;k<l;k++){
				if(eqpList[j].id.compareTo(eqpList[k].id) > 0){
					temp=eqpList[j].id;
					eqpList[j].id=eqpList[k].id;
					eqpList[k].id=temp;

					temp1=eqpList[j].desc;
					eqpList[j].desc=eqpList[k].desc;
					eqpList[k].desc=temp1;
				}
			}
		}
	}

	public boolean remove(String id) {
		int f=0,a=0,b=0;
        if(id.equals("null")){
            System.out.println("Error - id cannot be null");
            return false;
        }
        else{
        	for(int j=0;j<l;j++){
				if(eqpList[j].id.equals(id)){
					f=1;
					a=j;
				}
			}
			if(f==1){
				for(int k=0;k<l;k++) {
					if(k!=a){
					eqpList[b++]=eqpList[k];
				}
			}
			l--;
			return true;
			}
        }
        return false;
    }

    public boolean find(String id) {

        if(id.equals("null")){
            System.out.println("Error - id cannot be null.");
            return false;
        }
        else{	
	        for(int i=0; i<l; i++)
	           { 
	           	if(eqpList[i].id.equals(id))
	           	    return true;
	           }
        }

        return false;
    }

    public void display() {
    	System.out.println("id   | desc     ");
        for(int i=0; i<l; i++){
            System.out.println("\n"+eqpList[i].id+" | "+
                               eqpList[i].desc+"\n");
        }

    }
}
class Equipment{
    String id, desc;
    public Equipment(String id, String desc){
        this.id = id;
        this.desc = desc;
    }
    String getId(){
        return this.id;
    }
    String getDesc(){
        return this.desc;
    }
}
