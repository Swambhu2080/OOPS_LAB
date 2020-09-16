class p2{
	public static void main(String[] args){
		
		
			char ch = args[0].charAt(0);

			switch(ch){
				case 'A':System.out.println("Action movie fan\n");
						break;
				case 'a':System.out.println("Action movie fan\n");
						break;
				case 'C':System.out.println("Comedy movie fan\n");
						break;
				case 'c':System.out.println("Comedy movie fan\n");
						break;
				case 'D':System.out.println("Drama movie fan\n");
						break;
				case 'd':System.out.println("Drama movie fan\n");
						break;
				default :System.out.println("Invalid Choice\n");
						break;
			}
	}
}