import java.util.Scanner;

public class TravelBot_Deliverable_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vacayType;
		String vacayDestination;
		String vacayMode;
		String theConfirmation;
		String theNumber;
		int groupSize;
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello! TravelBot here. Would you like to go on a musical trip, a tropical trip, or an adventurous trip?");
			vacayType = scan.nextLine();
			
		System.out.println("Got it! How many people are you taking on your trip?");
			groupSize = scan.nextInt();
			
if (vacayType.equals("musical"))
	vacayDestination = "to New Orleans";
else if (vacayType.equals("tropical"))
	vacayDestination = "to a beach vacation in Mexico";
else if (vacayType.equals("adventurous"))
	vacayDestination = "whitewater rafting at the Grand Canyon";
else
	vacayDestination = "null";


if (vacayDestination.contentEquals("to New Orleans"))
	theConfirmation = "Get ready for jazz and delicious Creole cuisine! ";
else if (vacayDestination.contentEquals("to a beach vacation in Mexico"))
	theConfirmation = "Que bueno! ";
else if (vacayDestination.contentEquals("whitewater rafting at the Grand Canyon"))
	theConfirmation = "Make sure you wear a helmet! ";
else
	theConfirmation = "null";
	

if (groupSize == 1)
	vacayMode = "first class";
else if (groupSize == 2)
	vacayMode = "first class";
else if (groupSize == 3)
	vacayMode = "a helicopter";
else if (groupSize == 4)
	vacayMode = "a helicopter";
else if (groupSize == 5)
	vacayMode = "a helicopter";
else if (groupSize >= 6 )
	vacayMode = "a charter flight";
else
	vacayMode = "null"; 


if (groupSize == 1) 
	theNumber = "You ";
 else 
		theNumber = "The " + groupSize + " of you ";

System.out.println(theConfirmation + theNumber + "should go " + vacayDestination + " via " + vacayMode + " for your " + vacayType + " trip!");

		
	}

}
