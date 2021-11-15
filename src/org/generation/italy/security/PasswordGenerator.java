package org.generation.italy.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		
		String name;
		String surname;
		String favColor;
		
		int bdayDay;
		int bdayMonth;
		int bdayYears;
		
		
		//assegnamento
		
		name = "Elia";
		surname = "Mazzucco";
		favColor = "Purple";
		
		bdayDay = 16;
		bdayMonth = 8;
		bdayYears = 1995;		
			
		int bDayTot = bdayDay + bdayMonth + bdayYears;
		
		
		System.out.println("Ho un utente che si chiama " + name + " " + surname + " nato il " + bdayDay + "-" + bdayMonth + "-" + bdayYears   + " il cui colore preferito è il " + favColor);
		System.out.print("La sua password sarà " + name  + "-" +surname + "-" + favColor + "-" );
		System.out.println(bDayTot);
		
		
		
	
		
				

	}

}
