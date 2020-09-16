class p3{

	 public static void main(String[] args) {
		
		int s = Integer.parseInt(args[0]);
	 	int m = Integer.parseInt(args[1]);

	 	 if(s>=700  && s<= 999){
	 		if(m<20 && (s>=700  && s<=799)){
	 			System.out.println(" Grade B \n");
	 		}
	 		else{
	 			System.out.println(" Grade A \n");
	 		}
	 	}
	 	else if(s>=600  && s<= 799){
	 		if( m<10 && (s>=600  && s<=649)){
	 			System.out.println(" Grade C \n");
	 		}
	 		else{
	 			System.out.println(" Grade B \n");
	 		}
	 	}
	 	else if(s>= 500 && s<=649){
	 		System.out.println(" Grade C \n");
	 	}
	 
	 	
	}
}