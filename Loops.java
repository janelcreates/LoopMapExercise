import java.util.*;

public class Loops {
	public static void main (String[] args) {	
		Scanner userInput = new Scanner(System.in);
		
		
		HashMap<String, String> vehicles = new HashMap<String, String>();
		
		vehicles.put("Civic", "Honda");
		vehicles.put("Clarity", "Honda");
		vehicles.put("Rav 4", "Toyota");
		vehicles.put("Camry", "Toyota");
		vehicles.put("Model X", "Tesla");
		vehicles.put("Model Y", "Tesla");
		
		System.out.println("What kind of car model are you looking for?");
		String carModel = userInput.nextLine();
		
		String userMake = vehicles.get(carModel);
		
		
		if (userMake == null) {
			System.out.println("You're looking for a different car.");
		} else { 
			System.out.println("You're looking for a " + userMake);
		}
		
	}

}
