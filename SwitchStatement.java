public class SwitchStatement{
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		String name;
		int score;
		
		System.out.print("Enter name: ");
        name = scan.nextLine();

	    
		System.out.print("Enter score: ");
        name = scan.nextLine();
		
		switch(score)/10{
			case 10:
			case 9:
			        System.out.println(name + "Your grade is Outstanding");
		    break;
			
			case 8:
			case 7:
			case 6:
			        System.out.println(name + " Your grade is Exellent");
		    
			break;
			
			  
			case 5:
			        System.out.println(name + " Your grade is Good");
			break;
			  
		    
			case 3:
			case 2:
			case 1:
		    case 0:
			         System.out.println(name + " Your grade is Average");
					 
					 
			
    
	
	    }
	}
}	
